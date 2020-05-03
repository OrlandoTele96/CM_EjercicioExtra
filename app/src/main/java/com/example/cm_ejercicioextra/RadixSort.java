package com.example.cm_ejercicioextra;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RadixSort implements Serializable {

    private  ArrayList<String> numbers;
    private  ArrayList<String> sorted_numbers;
    int c=0;

    public RadixSort(ArrayList<String> numbers, ArrayList<String> sorted_numbers) {
        this.numbers = numbers;
        this.sorted_numbers = sorted_numbers;
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<String> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> getSorted_numbers() {
        return sorted_numbers;
    }

    public void setSorted_numbers(ArrayList<String> sorted_numbers) {
        this.sorted_numbers = sorted_numbers;
    }

    public int calculateMax(){
        int temp=0;
        for(int i=0;i<numbers.size();i++)
        {
            if(Integer.parseInt(numbers.get(i))>temp){
                temp=Integer.parseInt(numbers.get(i));
                //Log.d("MainActivity","positionmax"+temp);
            }
        }
        return Integer.toString(temp).length();
    }

    public int getDigit(String number, int digit,int max)
    {

        if(number.length()-1>=digit)
        {

            char[] n = number.toCharArray();
            int position = number.length()-(digit+1);
            int d= Character.getNumericValue(n[position]);
            return d;
        }
        else{

            return 0;
        }


    }

    public void rSort(){
        int max = calculateMax();

        //int maxpos =

        ArrayList<String> b0 = new ArrayList<String>();
        ArrayList<String> b1 = new ArrayList<String>();
        ArrayList<String> b2 = new ArrayList<String>();
        ArrayList<String> b3 = new ArrayList<String>();
        ArrayList<String> b4 = new ArrayList<String>();
        ArrayList<String> b5 = new ArrayList<String>();
        ArrayList<String> b6 = new ArrayList<String>();
        ArrayList<String> b7 = new ArrayList<String>();
        ArrayList<String> b8 = new ArrayList<String>();
        ArrayList<String> b9 = new ArrayList<String>();


        for (int i=0;i<max;i++)
        {
            sorted_numbers.clear();
            for (int j=0;j<numbers.size();j++){

                int digit = getDigit(numbers.get(j),i,max);
                switch (digit){
                    case 0:
                        b0.add(numbers.get(j));
                        break;
                    case 1:
                        b1.add(numbers.get(j));
                        break;
                    case 2:
                        b2.add(numbers.get(j));
                        break;
                    case 3:
                        b3.add(numbers.get(j));
                        break;
                    case 4:
                        b4.add(numbers.get(j));
                        break;
                    case 5:
                        b5.add(numbers.get(j));
                        break;
                    case 6:
                        b6.add(numbers.get(j));
                        break;
                    case 7:
                        b7.add(numbers.get(j));
                        break;
                    case 8:
                        b8.add(numbers.get(j));
                        break;
                    case 9:
                        b9.add(numbers.get(j));
                        break;
                }


            }
            if (b0.size()!=0)
            {
                sorted_numbers.addAll(b0);
                b0.clear();
            }
            if (b1.size()!=0)
            {
                sorted_numbers.addAll(b1);
                b1.clear();
            }
            if (b2.size()!=0)
            {
                sorted_numbers.addAll(b2);
                b2.clear();
            }
            if (b3.size()!=0)
            {
                sorted_numbers.addAll(b3);
                b3.clear();
            }
            if (b4.size()!=0)
            {
                sorted_numbers.addAll(b4);
                b4.clear();
            }
            if (b5.size()!=0)
            {
                sorted_numbers.addAll(b5);
                b5.clear();
            }
            if (b6.size()!=0)
            {
                sorted_numbers.addAll(b6);
                b6.clear();
            }
            if (b7.size()!=0)
            {
                sorted_numbers.addAll(b7);
                b7.clear();
            }
            if (b8.size()!=0)
            {
                sorted_numbers.addAll(b8);
                b8.clear();
            }
            if (b9.size()!=0)
            {
                sorted_numbers.addAll(b9);
                b9.clear();
            }
            numbers.clear();
            numbers.addAll(sorted_numbers);
            //for (int j=0;j<sorted_numbers.)
        }

    }


}

