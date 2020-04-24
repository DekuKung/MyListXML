package com.example.mylistxml;

import android.app.Activity;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylistxml.R;

public class DesignList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final TypedArray imgId;

    public DesignList(Activity context,String[] title, TypedArray imgId){
        super(context, R.layout.my_row,title);
        this.context = context;
        this.title = title;
        this.imgId = imgId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_row,null,true);
        TextView textView ;
        textView = (TextView) rowView.findViewById(R.id.txt);
        textView.setText(title[position]);
        ImageView imageView;
        imageView = (ImageView) rowView.findViewById(R.id.img);
        imageView.setImageResource(imgId.getResourceId(position,0));
        return  rowView;

    }

}
