package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();
        String getname = intent.getStringExtra("name");
        System.out.println(getname);

        TextView regisname = findViewById(R.id.regisname);
        regisname.setText(getname);

        Bundle bundle = getIntent().getExtras();
        System.out.println("This is from the Bundle "+bundle.getString("username"));


    }
}