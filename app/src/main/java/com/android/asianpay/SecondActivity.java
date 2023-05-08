package com.android.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button male,female, other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //
        male = findViewById(R.id.option_male);
        female = findViewById(R.id.option_female);
        other = findViewById(R.id.option_other);
        //
        male.setOnClickListener(onButtonClick);
        female.setOnClickListener(onButtonClick);
        other.setOnClickListener(onButtonClick);
        //
    }

    private View.OnClickListener onButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String gender = "";
            Intent intent  = new Intent();
            switch (view.getId()){
                case R.id.option_male:
                    gender = "Male";
                    break;
                case R.id.option_female:
                    gender = "Female";
                    break;
                case R.id.option_other:
                    gender = "Other";
                    break;
            }

            intent.putExtra("gender",gender);
            setResult(MainActivity.CODE, intent);
            finish();
        }
    };
}