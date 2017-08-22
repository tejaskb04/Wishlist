package com.example.practicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etEmail = (EditText) findViewById(R.id.email);
        final EditText etUsername = (EditText) findViewById(R.id.userId);
        final EditText etPassword = (EditText) findViewById(R.id.pass);
        final Button registerBtn = (Button) findViewById(R.id.register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = etEmail.getText().toString();
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(email, username, password,
                        responseListener);
            }
        });
    }
}
