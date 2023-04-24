package com.android.asianpay.district.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.asianpay.R;
import com.android.asianpay.district.model.DistrictModel;

import java.util.ArrayList;

public class DistrictRecyclerViewAdapter extends
        RecyclerView.Adapter<DistrictRecyclerViewAdapter.ViewHolder>
{

    //todo 1 implement methods and complete each function - DONE
    //todo 2 create constructor and variables - DONE

    ArrayList<DistrictModel> data;
    Context context;

    public DistrictRecyclerViewAdapter(ArrayList<DistrictModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.district_recycler_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DistrictModel model  = data.get(position);
        holder.districtName.setText(model.getDistrictname());
        holder.districtArea.setText("Area: " +model.getArea()+ " sq.km");
        holder.districtPopulation.setText("Population: "+model.getPopulation());
        holder.districtTemp.setText("Average Temperature: "+model.getAvgTemperature()+" Degree Celsius");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView districtName, districtPopulation, districtArea, districtTemp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            districtArea = itemView.findViewById(R.id.district_area);
            districtName = itemView.findViewById(R.id.district_name);
            districtPopulation = itemView.findViewById(R.id.district_population);
            districtTemp = itemView.findViewById(R.id.district_temp);
        }
    }


}
