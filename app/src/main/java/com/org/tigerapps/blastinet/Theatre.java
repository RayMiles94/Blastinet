package com.org.tigerapps.blastinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Theatre extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText champ1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);
        champ1 = findViewById(R.id.champ1);
        Spinner sp1 = (Spinner) findViewById(R.id.theatre_spin1);
        Spinner sp2 = (Spinner) findViewById(R.id.theatre_spin2);
        ArrayAdapter<String> adpater1 = new ArrayAdapter<String>(Theatre.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.array_theatre1));
        adpater1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adpater1);

        ArrayAdapter<String> adpater2 = new ArrayAdapter<String>(Theatre.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.array_theatre2));
        adpater2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adpater2);
    }
}
