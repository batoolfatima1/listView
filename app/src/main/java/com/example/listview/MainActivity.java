package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView list ;
    Button btn;
    EditText text;
    ArrayList<String> array = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        list = findViewById(R.id.listview);
        text= findViewById(R.id.txt);
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.add("F");
        array.add("G");
        array.add("H");
        array.add("I");
        array.add("J");
        array.add("K");
        array.add("L");
//        array.add("M");
//        array.add("N");
//        array.add("O");
//        array.add("P");
//        array.add("Q");
//        array.add("R");
//        array.add("S");
//        array.add("T");
//        array.add("U");
//        array.add("V");
//        array.add("W");
//        array.add("X");
//        array.add("Y");
         adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,array);
        list.setAdapter(adapter);
    }

    public void onClickfunction(View v)
    {
        array.add(text.getText().toString());
        adapter.notifyDataSetChanged();
    }
//    btn.setOnClickListener(new View.OnClickListener)
//    {
//        void onClick
//    }
}