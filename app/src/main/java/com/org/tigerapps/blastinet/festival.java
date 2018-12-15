package com.org.tigerapps.blastinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class festival extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
        Spinner sp1 = (Spinner) findViewById(R.id.spin1);
        ArrayAdapter<String> adpater1 = new ArrayAdapter<String>(festival.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin1));
        adpater1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adpater1);

        Spinner sp2 = (Spinner) findViewById(R.id.spin2);
        ArrayAdapter<String> adpater2 = new ArrayAdapter<String>(festival.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin2));
        adpater2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }
}
