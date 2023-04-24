package com.android.asianpay;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.asianpay.adapter.AnimalRecyclerAdapter;
import com.android.asianpay.model.AnimalModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    RecyclerView animalRecycler;
    AnimalRecyclerAdapter adapter;
    ArrayList<AnimalModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get and parse data
        convertingData();


        //init recycler
        animalRecycler = findViewById(R.id.recycler);
        //set layout manager
        animalRecycler.setLayoutManager(new LinearLayoutManager(this));
        //make adapter
        adapter = new AnimalRecyclerAdapter(this, data);
        //set adapter
        animalRecycler.setAdapter(adapter);



    }

    void convertingData(){

        //gets file source
        InputStream inputStream = getResources().openRawResource(R.raw.animal);
        //converts json to string
        String jsonString = new Scanner(inputStream).useDelimiter("\\A").next();
        //init gson library
        Gson gson = new Gson();
        //declares type (what type of data are your expecting from jsonString?)
        Type type = new TypeToken<ArrayList<AnimalModel>>() {}.getType();
        //uses that `type` object to convert jsonString to required arraylist
        data = gson.fromJson(jsonString,type);

    }
}
