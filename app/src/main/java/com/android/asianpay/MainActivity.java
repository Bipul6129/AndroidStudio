package com.android.asianpay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//todo 1: create 2 layouts as fragment_a.xml and fragment_b.xml
//todo 2: fragment_a.xml should have background color red and fragment_b must have blue
//todo 3: in activity_main.xml use linearlayout root with framelayout followed by two buttons
//todo 4: buttons must be named A and B with id as btn_fragment_a and btn_fragment_b
//todo 5: create class FragmentA and extend Fragment inside fragments package
//todo 6: override onViewCreated and inflate the view `inflater.inflate(layout, container, false)
//todo 7: init buttons in main activity with listeners
//todo 8: use replaceFragment function in listeners

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //fixme code below this line here
        //////////////////////////////////////////


        /////////////////////////////////////////
    }


    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

    }


}
