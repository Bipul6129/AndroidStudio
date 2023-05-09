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
    Button male_btn;
    Button female_btn;
    Button other_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        male_btn=findViewById(R.id.option_male);
        female_btn=findViewById(R.id.option_female);
        other_btn=findViewById(R.id.option_other);
        //
        male_btn.setOnClickListener(buttonClickChange);
        female_btn.setOnClickListener(buttonClickChange);
        other_btn.setOnClickListener(buttonClickChange);

    }
    private View.OnClickListener buttonClickChange = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(SecondActivity.this,MainActivity.class);

            switch(view.getId()){
                case R.id.option_male:
                    i.putExtra("gender","male");
                    break;
                case R.id.option_female:
                    i.putExtra("gender","female");
                    break;
                case R.id.option_other:
                    i.putExtra("gender","other");
                    break;


            }
            setResult(202,i);
            finish();
        }
    };


}
