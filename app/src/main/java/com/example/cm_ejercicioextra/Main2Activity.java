package com.example.cm_ejercicioextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    RadixSort r;
    ListView lvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        r =(RadixSort) bundle.getSerializable(getResources().getString(R.string.r));

        lvNumber = findViewById(R.id.lvNumber);

        Adaptador adaptador = new Adaptador(getApplicationContext(),r.getSorted_numbers());

        lvNumber.setAdapter(adaptador);



    }
}
