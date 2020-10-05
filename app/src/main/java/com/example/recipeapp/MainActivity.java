package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnFoodListner {
    private static final String TAG = "MainActivity";

    private String[] recipes = new String[]{"Butter Chicken", "Chicken Brest", "Pizza", "Chicken Salad", "Chicken Tacos"};
    String[] des = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView Rv = findViewById(R.id.recycleview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, recipes, des, this);
        Rv.setAdapter(adapter);
        Rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onFoodClick(int position) {
        Log.d(TAG, "onFoodClick: clicked.");
        Intent intent = new Intent(this, GalleryClass.class);
        intent.putExtra("pos", position);
        startActivity(intent);
    }
}