package com.org.tigerapps.blastinet;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button loginbtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            login = findViewById(R.id.loginsign);
            password = findViewById(R.id.pwlogin);
            loginbtc = (Button) findViewById(R.id.loginb);
        }

        public void onlogin(View v){

        }
    }

