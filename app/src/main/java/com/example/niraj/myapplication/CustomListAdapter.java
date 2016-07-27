package com.example.niraj.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] names;
    protected Integer[] imageid;

    public CustomListAdapter(Activity context, String[] names, Integer[] imageid) {
        super(context, R.layout.my_list, names);
        this.context = context;
        this.names = names;
        this.imageid = imageid;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.my_list, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        textView.setText(names[position]);
        String s =names[position];
        if (s.startsWith("HTML")) {
            imageView.setImageResource(R.drawable.image02);
        } else {
            if (s.startsWith("JAVA SCRIPT")) {
                imageView.setImageResource(R.drawable.img4);
            }
            else if (s.startsWith("CSS")) {
                imageView.setImageResource(R.drawable.img5);
            } else {
                imageView.setImageResource(R.drawable.img1);
            }
        }

        return rowView;
    }
}
