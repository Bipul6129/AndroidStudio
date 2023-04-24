package com.android.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.asianpay.model.AnimalModel;

public class AnimalDetailActivity extends AppCompatActivity {

    TextView animalNameTextView, scientificNameTextView, dietTextView, habitatTextView, descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        //initialize textview
        animalNameTextView = findViewById(R.id.animal_name);
        scientificNameTextView = findViewById(R.id.scientific_name);
        dietTextView = findViewById(R.id.diet);
        habitatTextView = findViewById(R.id.habitat);
        descriptionTextView = findViewById(R.id.description);

        //get intent
        AnimalModel animalModel;
        animalModel = (AnimalModel) getIntent().getSerializableExtra("animal_detail");

        //set data
        animalNameTextView.setText(animalModel.getName());
        scientificNameTextView.setText(animalModel.getScientificName());
        dietTextView.setText(animalModel.getDiet());
        habitatTextView.setText(animalModel.getHabitat());
        descriptionTextView.setText(animalModel.getDescription());


    }
}