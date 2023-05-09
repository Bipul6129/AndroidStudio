package com.android.asianpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class MainActivity extends AppCompatActivity {

    public static final int CODE = 202;

    //todo 1 : create Button with id `go` and initialize
    //todo 2 : create TextView with id `result` and initialize
    //todo 3 : add onClickListener for `go` button
    //todo 4 : create Intent from Main to SecondActivity as object i
    //todo 5 : call function `startActivityForResult(intent, 202)`
    //todo 12 : override onActivityResult and if requestCode == 202, data.getStringExtra("gender)
    //todo 13 : result.setText() the incoming value

    Button go_btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_btn = findViewById(R.id.btn_result);
        result = findViewById(R.id.result);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//            startActivity(intent);
            startActivityForResult(intent,CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CODE){
            String value = data.getStringExtra("gender");
            result.setText(value);
        }
    }
}
