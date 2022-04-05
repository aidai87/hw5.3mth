package com.example.hw53mth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder> {
    private ArrayList<String> data;

    public ThirdAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ThirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ThirdViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ThirdViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_item;

        public ThirdViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_item = itemView.findViewById(R.id.tv_item);
        }

        public void bind(String s) {
            tv_item.setText(s);
        }
    }
}
