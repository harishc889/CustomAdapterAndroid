package com.example.mannuharishsingh.customadapterwithemployeedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   GridView lv;
   ArrayList<model> employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     lv=findViewById(R.id.gridV);
     lv.setNumColumns(2);
     lv.setColumnWidth(15);

     employee=new ArrayList<>();
     employee.add(new model("harish","9756423780"));
     employee.add(new model("Pankaj","9870951656"));
     CustomAdapter customAdapter= new CustomAdapter(MainActivity.this,employee);
     lv.setAdapter(customAdapter);





    }
}
