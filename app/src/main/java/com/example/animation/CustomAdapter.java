package com.example.animation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    String[] data;
    Context context;

    public CustomAdapter(String[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.cardView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.recycler_view_animation));

        holder.textView.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
