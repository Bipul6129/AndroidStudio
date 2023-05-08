package com.android.asianpay;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.android.asianpay.frags.DialgoC;
import com.android.asianpay.frags.FragmentA;
import com.android.asianpay.frags.FragmentB;

//todo 1: create 2 layouts as fragment_a.xml and fragment_b.xml
//todo 2: fragment_a.xml should have background color red and fragment_b must have blue
//todo 3: in activity_main.xml use linearlayout root with framelayout followed by two buttons
//todo 4: buttons must be named A and B with id as btn_fragment_a and btn_fragment_b
//todo 5: create class FragmentA and extend Fragment inside fragments package
//todo 6: override onViewCreated and inflate the view `inflater.inflate(layout, container, false)
//todo 7: init buttons in main activity with listeners
//todo 8: use replaceFragment function in listeners

public class MainActivity extends AppCompatActivity {
    Button btn_a;
    Button btn_b;
    Button btn_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_a = findViewById(R.id.btn_to_a);
        btn_b = findViewById(R.id.btn_to_b);
        btn_c = findViewById(R.id.btn_c);
        //fixme code below this line here
        //////////////////////////////////////////
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FragmentA());
            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FragmentB());
            }
        });

        btn_c.setOnClickListener(view -> new DialgoC().show(getSupportFragmentManager(),DialgoC.TAG));

        /////////////////////////////////////////
    }


    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.commit();

    }


}
