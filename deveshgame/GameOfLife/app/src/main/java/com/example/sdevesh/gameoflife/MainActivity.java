package com.example.sdevesh.gameoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.Arrays;
import java.util.List;

import static com.example.sdevesh.gameoflife.R.layout.custom_layout;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    Button start;
    Button stop;
   List<Integer> list= Arrays.asList(1,2,9,3,4,5,5,1,1,1,1,1,1,1,1,1,1,11,11,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        gridView=findViewById(R.id.grid);
        ArrayAdapter myAdapter = new ArrayAdapter(this,R.layout.custom_layout,list);
        gridView.setAdapter(myAdapter);
    }
}
