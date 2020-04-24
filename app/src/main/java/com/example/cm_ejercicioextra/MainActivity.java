package com.example.cm_ejercicioextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle,tvNumber;
    EditText etN1,etN2,etN3,etN4;
    Button btnSort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle=findViewById(R.id.tvTitle);
        tvNumber=findViewById(R.id.tvNumber);

        etN1=findViewById(R.id.etN1);
        etN2=findViewById(R.id.etN2);
        etN3=findViewById(R.id.etN3);
        etN4=findViewById(R.id.etN4);

        btnSort=findViewById(R.id.btnSort);

        tvTitle.setText(getResources().getString(R.string.instruction));
        tvNumber.setText(getResources().getString(R.string.tnumbers));

        btnSort.setText(getResources().getString(R.string.bsort));

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
