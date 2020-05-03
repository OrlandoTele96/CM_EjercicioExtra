package com.example.cm_ejercicioextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle,tvNumber;
    EditText etN;
    Button btnSort;
    ImageButton ibtnAdd;

    ArrayList<String> numeros = new ArrayList<String>();
    ArrayList<String> sorted_ar = new ArrayList<String>();
    RadixSort r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle=findViewById(R.id.tvTitle);
        tvNumber=findViewById(R.id.tvNumber);

        etN=findViewById(R.id.etN);

        etN.setHint(getResources().getString(R.string.n_example));

        ibtnAdd = findViewById(R.id.ibtnAdd);

        btnSort=findViewById(R.id.btnSort);

        tvTitle.setText(getResources().getString(R.string.instruction));
        tvNumber.setText(getResources().getString(R.string.tnumbers));

        btnSort.setText(getResources().getString(R.string.bsort));

        ibtnAdd.setImageResource(R.drawable.add2);

        ibtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validate())
                {
                    Toast.makeText(MainActivity.this,getResources().getString(R.string.nadd),Toast.LENGTH_SHORT).show();
                    numeros.add(etN.getText().toString());
                    etN.setText(getResources().getString(R.string.voidtext));

                }
                else{
                    Toast.makeText(MainActivity.this,getResources().getString(R.string.error_positive),Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*
                Como método se usa Radix sort. Este metodo consiste en sacar el número máximo de digitos en el arreglo,
                en base a eso, se tienen 10 cubetas (cada una para los digitos 0,1,2,3,4,5,6,7,8,9). La primera iteración
                se vacían los primeros digitos (menos significativos) en cada cubeta segun sea su caso.
                Ej.

                1,2,542,871,324,975, en donde 1 y 871 va en la cubeta uno , 2 y 542 en la cubeta dos, 324 en la cubeta 4 y 975
                en la cubeta 5.

                La segunda iteración se haría con los segundos digitos, vaciando en orden por digitos, es decir, empezando desde la cubeta 0
                entonces se tiene que :

                de la cubeta uno; 1 se va a la cubeta de cero y 871 a la cubeta 7.
                de la cubeta dos; 2 se va a la cubeta cero y 542 a la cubeta 4.

                Este proceso se repite hasta llegar al numero maximo de digitos, en este caso sería 3 el numero máximo.
        */
        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numeros.size()>0){
                    Log.d(getResources().getString(R.string.ma),getResources().getString(R.string.sorted_msj));
                    r = new RadixSort(numeros,sorted_ar);
                    r.rSort();
                    //r.setNumbers(numeros);
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(getResources().getString(R.string.r),r);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
                else {
                    Log.d(getResources().getString(R.string.ma),getResources().getString(R.string.error_void));
                }
            }
        });
    }

    public boolean Validate()
    {
        if (etN.getText().toString().length() <= 4) {
            try{
                int number = Integer.parseInt(etN.getText().toString());
                if(number>0){
                    return true;
                }
                else {
                    return false;
                }

            }catch (Exception e){
                return false;
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,getResources().getString(R.string.error_digits),Toast.LENGTH_SHORT).show();
            return false;
        }

    }
}
