package com.android.asianpay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.asianpay.adapter.ContactRecyclerAdapter;
import com.android.asianpay.model.ContactItem;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    //recyclerview object
    RecyclerView myRecyclerView;
    //layoutmanager object
    LinearLayoutManager linearLayoutManager;
    //adapter object
    ContactRecyclerAdapter contactRecyclerAdapter;
    //data array object
    ArrayList<ContactItem> dataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        //function to load data
        createDataArray();

        //write all code below ----------------------------------

        //initialize recyclerview
        myRecyclerView = findViewById(R.id.recycler);
        //linear layout manager
        linearLayoutManager = new LinearLayoutManager(this);
        //set layout manager to recycler
        myRecyclerView.setLayoutManager(linearLayoutManager);
        //initial adapter
        contactRecyclerAdapter = new ContactRecyclerAdapter(this,dataArrayList);
        //set adapter
        myRecyclerView.setAdapter(contactRecyclerAdapter);


    }


    void createDataArray(){
        //sample data for list
        dataArrayList.add(new ContactItem("Ram","9841225544","Kathmandu"));
        dataArrayList.add(new ContactItem("Shyam","9841556677","Bhaktapur"));
        dataArrayList.add(new ContactItem("Hari","9841778899","Lalitpur"));
        dataArrayList.add(new ContactItem("Gita","9841002233","Pokhara"));
        dataArrayList.add(new ContactItem("Sita","9841334455","Chitwan"));
        dataArrayList.add(new ContactItem("Nita","9841667788","Butwal"));
        dataArrayList.add(new ContactItem("Rita","9841889900","Dharan"));
        dataArrayList.add(new ContactItem("Binita","9841223344","Biratnagar"));
        dataArrayList.add(new ContactItem("Kamal","9841556677","Janakpur"));
        dataArrayList.add(new ContactItem("Suresh","9841778899","Birgunj"));
        dataArrayList.add(new ContactItem("Dipesh","9841002233","Ilam"));
        dataArrayList.add(new ContactItem("Pratima","9841334455","Jhapa"));
        dataArrayList.add(new ContactItem("Rajesh","9841667788","Dhangadi"));
        dataArrayList.add(new ContactItem("Ramesh","9841889900","Nepalgunj"));
        dataArrayList.add(new ContactItem("Bikash","9841223344","Kailali"));
        dataArrayList.add(new ContactItem("Pooja","9841556677","Surkhet"));
        dataArrayList.add(new ContactItem("Binod","9841778899","Gorkha"));
        dataArrayList.add(new ContactItem("Bijay","9841002233","Syangja"));
        dataArrayList.add(new ContactItem("Rina","9841334455","Kaski"));
        dataArrayList.add(new ContactItem("Kiran","9841667788","Bhojpur"));
        dataArrayList.add(new ContactItem("Bimal","9841990011","Salyan"));
        dataArrayList.add(new ContactItem("Roshan","9841773344","Dang"));
        dataArrayList.add(new ContactItem("Nabin","9841229900","Baglung"));
        dataArrayList.add(new ContactItem("Rajan","9841332277","Gulmi"));
        dataArrayList.add(new ContactItem("Manish","9841664400","Myagdi"));
        dataArrayList.add(new ContactItem("Shristi","9841882266","Tanahun"));
        dataArrayList.add(new ContactItem("Sarita","9841221133","Bara"));
        dataArrayList.add(new ContactItem("Dinesh","9841556677","Kavrepalanchok"));
        dataArrayList.add(new ContactItem("Bimala","9841778899","Rupandehi"));
        dataArrayList.add(new ContactItem("Kusum","9841002233","Sindhupalchok"));
        dataArrayList.add(new ContactItem("Nishant","9841334455","Saptari"));
        dataArrayList.add(new ContactItem("Suman","9841667788","Sunsari"));
    }
}