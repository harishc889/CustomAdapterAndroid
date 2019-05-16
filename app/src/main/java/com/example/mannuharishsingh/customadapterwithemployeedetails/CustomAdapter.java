package com.example.mannuharishsingh.customadapterwithemployeedetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    ArrayList<model> employee;
    LayoutInflater li;
    CustomAdapter(Context c, ArrayList<model> name)
    {
      employee=name;
         li=LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return employee.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view =li.inflate(R.layout.layout,null);
        TextView tv= view.findViewById(R.id.textViewname);
        TextView tv1= view.findViewById(R.id.textViewphone);
        tv.setText(employee.get(position).name);
        tv1.setText(employee.get(position).phone);

        return view;

    }
}
