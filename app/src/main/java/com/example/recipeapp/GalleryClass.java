package com.example.recipeapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GalleryClass extends AppCompatActivity {
    private static final String TAG = "GalleryClass";
    private String[] recipes = new String[]{"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Egestas diam in arcu cursus euismod. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Massa enim nec dui nunc mattis enim ut tellus. Pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies. Habitant morbi tristique senectus et netus. Pellentesque pulvinar pellentesque habitant morbi tristique senectus. Aliquet enim tortor at auctor urna nunc id.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Egestas diam in arcu cursus euismod. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Massa enim nec dui nunc mattis enim ut tellus. Pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies. Habitant morbi tristique senectus et netus. Pellentesque pulvinar pellentesque habitant morbi tristique senectus. Aliquet enim tortor at auctor urna nunc id.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Egestas diam in arcu cursus euismod. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Massa enim nec dui nunc mattis enim ut tellus. Pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies. Habitant morbi tristique senectus et netus. Pellentesque pulvinar pellentesque habitant morbi tristique senectus. Aliquet enim tortor at auctor urna nunc id.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Egestas diam in arcu cursus euismod. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Massa enim nec dui nunc mattis enim ut tellus. Pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies. Habitant morbi tristique senectus et netus. Pellentesque pulvinar pellentesque habitant morbi tristique senectus. Aliquet enim tortor at auctor urna nunc id.",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Justo donec enim diam vulputate ut pharetra sit. Convallis tellus id interdum velit. Ut tristique et egestas quis ipsum suspendisse ultrices gravida. Praesent semper feugiat nibh sed pulvinar proin gravida hendrerit lectus. Egestas diam in arcu cursus euismod. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Massa enim nec dui nunc mattis enim ut tellus. Pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies. Habitant morbi tristique senectus et netus. Pellentesque pulvinar pellentesque habitant morbi tristique senectus. Aliquet enim tortor at auctor urna nunc id."};
    Integer[] pictures = {R.drawable.butter, R.drawable.chickenbrest, R.drawable.pizza, R.drawable.salad, R.drawable.taco};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_gallery);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming Intent");
        int position = getIntent().getIntExtra("pos",0);
        setImage(position);
    }

    private void setImage(int position){
        TextView name = findViewById(R.id.receipe);
        name.setText(recipes[position]);
        ImageView img = findViewById(R.id.foodpic);
        img.setImageResource(pictures[position]);
    }
}
