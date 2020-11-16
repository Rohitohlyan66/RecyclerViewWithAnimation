package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);


        list= new String[]{getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum),
                getResources().getString(R.string.loremIpsum)};

        adapter=new CustomAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}