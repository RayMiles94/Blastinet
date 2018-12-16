package com.org.tigerapps.blastinet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {


    EditText mail;
    EditText name;
    EditText lname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mail = (EditText)  findViewById(R.id.mail);
        name = (EditText)  findViewById(R.id.name);
        lname = (EditText)  findViewById(R.id.lname);
    }


    public void SaveInDB(View v){
            
    }
}
