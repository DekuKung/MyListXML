package com.example.mylistxml;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] food_menu;
    int[] arrImg;
    private TypedArray img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = getResources().obtainTypedArray(R.array.images);
        food_menu = getResources().getStringArray(R.array.foods);

        ListView menu;
        menu = (ListView)findViewById(R.id.ListFood);
        DesignList adapter = new DesignList(MainActivity.this, food_menu,img);
        menu.setAdapter(adapter);
    }
}
