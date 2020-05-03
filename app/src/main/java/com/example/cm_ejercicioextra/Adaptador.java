package com.example.cm_ejercicioextra;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    Context contexto;
    ArrayList<String> numbers;

    public Adaptador(Context contexto, ArrayList<String> numbers) {
        this.contexto = contexto;
        this.numbers = numbers;
    }


    @Override
    public int getCount() {
        return numbers.size();
    }

    @Override
    public Object getItem(int position) {
        return numbers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(contexto,R.layout.item,null);

        TextView tvItem_n = v.findViewById(R.id.tvItem_n);

        tvItem_n.setText(numbers.get(position));

        return v;
    }
}
