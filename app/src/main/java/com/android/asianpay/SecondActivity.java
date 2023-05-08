package com.android.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    //todo 6 : Initialize 3 Buttons : male, female, others
    //todo 7: Create onButtonClick as View.OnClickListener
    //todo 8: switch view.getId() and set gender string accordingly
    //todo 9: create intent which will have `gender` extra value ready to return
    //todo 10: setResult(202, intent)
    //todo 11: finish


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //

    }
}
