package com.android.asianpay;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


//create 3 drawables vectrors

// new android resource directory, res>new>android resource dir

// in menu folder, new menu_res file

// new example menu, add items and sub items

// ctrl +alt > onCreateOption menu

public class MainActivity extends AppCompatActivity {


    //todo 1 : add 3 vector icons to the project from clip art source
    //todo 2: in res folder create new `android resource directory` folder named "menu"
    //todo 3: in menu folder create NEW > Menu Resource File called `example_menu.xml`
    //todo 4: add 3 items with id, icon, title, showAsAction fields


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //////////////////////////////////////////////////////////////////


    /**
     * todo 5: override onCreateOptionMenu
     *  todo : create an object of MenuInflater as inflater = getMenuInflater();
     *  todo : inflater.inflate(xml, menu);
     *  todo: return true;
     */

//////////////////////////////////////////////////////////////////

    /**
     * todo 5: override onOptionsItemSelected
     *  todo : switch for item.getItemId
     *  todo : write cases for item1 and item2
     *  todo: return super.onOptionItemSelected(item);
     */


}
