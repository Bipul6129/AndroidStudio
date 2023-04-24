package com.android.asianpay.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.asianpay.AnimalDetailActivity;
import com.android.asianpay.R;
import com.android.asianpay.model.AnimalModel;

import java.util.ArrayList;

public class AnimalRecyclerAdapter extends RecyclerView.Adapter<AnimalRecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<AnimalModel> data;

    public AnimalRecyclerAdapter(Context context, ArrayList<AnimalModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_recycler_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AnimalModel animalModel = data.get(position);
        holder.animalName.setText(animalModel.getName());
        holder.scientificName.setText(animalModel.getScientificName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AnimalDetailActivity.class);
                intent.putExtra("animal_detail",animalModel);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView animalName, scientificName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalName = itemView.findViewById(R.id.animal_name);
            scientificName = itemView.findViewById(R.id.scientific_name);
        }
    }
}
