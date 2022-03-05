package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail, edPassword;

    String name, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignIn);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = edEmail.getText().toString();

                Password = edPassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext();
                t.show();
            }
        });
    }
}
