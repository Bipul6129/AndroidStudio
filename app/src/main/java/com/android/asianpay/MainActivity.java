package com.android.asianpay;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.android.asianpay.fragments.DialogA;
import com.android.asianpay.fragments.FragmentA;
import com.android.asianpay.fragments.FragmentB;

//todo 1: create 2 layouts as fragment_a.xml and fragment_b.xml
//todo 2: fragment_a.xml should have background color red and fragment_b must have blue
//todo 3: in activity_main.xml use linearlayout root with framelayout followed by two buttons
//todo 4: buttons must be named A and B with id as btn_fragment_a and btn_fragment_b
//todo 5: create class FragmentA and extend Fragment
//todo 6: override onViewCreated and inflate the view `inflater.inflate(layout, container, false)
//todo 7: init buttons in main activity with listeners
//todo 8: use replaceFragment function in listeners

public class MainActivity extends AppCompatActivity {

        Button buttonA, buttonB;
        Button buttonC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonA = findViewById(R.id.btn_fragment_a);
        buttonB = findViewById(R.id.btn_fragment_b);
        buttonC = findViewById(R.id.btn_c);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FragmentA());
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FragmentB());
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new DialogA().show(getSupportFragmentManager(), "a");
            }
        });

    }



    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame,fragment);
        fragmentTransaction.commit();

    }



}
