package com.android.asianpay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.asianpay.R;
import com.android.asianpay.model.ContactItem;

import java.util.ArrayList;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ContactItem> dataArray;

    public ContactRecyclerAdapter(Context context, ArrayList<ContactItem> dataArray){
        this.context = context;
        this.dataArray = dataArray;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_recycler_item, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactItem item = dataArray.get(position);
        holder.name.setText(item.getName());
        holder.contact.setText(item.getNumber());
        holder.address.setText(item.getAddress());

    }

    @Override
    public int getItemCount() {
        return dataArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,contact,address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            contact = itemView.findViewById(R.id.phone);
            address = itemView.findViewById(R.id.address);
        }
    }
}
