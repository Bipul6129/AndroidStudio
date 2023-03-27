package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginbutton;
    Button registerbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView getUsername = findViewById(R.id.Enterusername);
        TextView getPassword = findViewById(R.id.Enterpassword);


        loginbutton = findViewById(R.id.Login);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(getUsername.getText().toString());
                System.out.println(getPassword.getText().toString());
            }
        });

        registerbutton = findViewById(R.id.RegisterB);
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = getUsername.getText().toString();
                String Password = getPassword.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("username",Username);

                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                intent.putExtra("name",Username);
                intent.putExtra("password",Password);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });


    }
}