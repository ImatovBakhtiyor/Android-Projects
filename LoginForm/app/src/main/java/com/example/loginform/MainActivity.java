package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button login,register;
  EditText edtpassword,edtLogin;
  String password="TEST11";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        edtpassword = findViewById(R.id.edtpassword);
        edtLogin    = findViewById(R.id.edtLogin);
        login.setOnClickListener(this);
        register.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                if(edtpassword.getText().toString().isEmpty() || edtLogin.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Free Login or Password", Toast.LENGTH_SHORT).show();
                 }
                else if(edtpassword.getText().toString().equals(password)){
                     Intent intent = new Intent(this,AllList.class);
                     startActivity(intent);
                 }
                 else{
                     Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
                 }

                break;
            case R.id.register:
                Toast.makeText(MainActivity.this, "Register clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}