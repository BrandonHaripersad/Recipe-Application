package com.example.recipeapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private String[] Name = new String[5];
    private String[] Description = new String[5];
    private OnFoodListner mOnFoodListner;
    private Context mcontext;

    public RecyclerViewAdapter(Context mcontext, String[] Name, String[] description, OnFoodListner mOnFoodListner) {
        this.Name = Name;
        this.Description = description;
        this.mcontext = mcontext;
        this.mOnFoodListner = mOnFoodListner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        ViewHolder holder = new ViewHolder(view, mOnFoodListner);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        //pic= new ImageView(mcontext);
        //name= new TextView(mcontext);
        // name.setText(mImagesNames[position]);
        //pic.setImageResource(Animals[position]);
        holder.FoodText.setText(Name[position]);
        holder.Description.setText(Description[position]);
    }

    public int getItemCount() {
        return Name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView FoodText;
        TextView Description;
        LinearLayout parentLayout;
        OnFoodListner onFoodListner;
        public ViewHolder(@NonNull View itemView, OnFoodListner onFoodListner) {
            super(itemView);
            FoodText = itemView.findViewById(R.id.title);
            Description = itemView.findViewById(R.id.des);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            this.onFoodListner = onFoodListner;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onFoodListner.onFoodClick(getAdapterPosition());
        }
    }

    public interface OnFoodListner{
        void onFoodClick(int postion);

    }
}