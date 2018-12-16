package com.org.tigerapps.blastinet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Calendar;

public class AccueilActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        String test ="this was created b Haythem";
        //DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //traitement base de donnees commence
        /*myDB = new DatabaseHelper(this);

            boolean t = myDB.insertData("colonne1","colonne2","colonne3");
                if (t)
                    Toast.makeText(AccueilActivity.this,"Data Inserted ",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(AccueilActivity.this,"Erreur Insertion ",Toast.LENGTH_SHORT).show();
/*
        Cursor res = myDB.getAlldata();
            StringBuffer buffer = new StringBuffer();
            while (res.moveToNext()){
                buffer.append("Id :" + res.getInt(0)+"\n");
                buffer.append("name :" + res.getInt(1)+"\n");
                buffer.append("email :" + res.getInt(2)+"\n");
                buffer.append("events :" + res.getInt(3)+"\n");
            }
            afficher_msg("Data",buffer.toString());

*/
        //traitement base de donnees fins



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.accueil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Accueil) {
            Intent intent = new Intent(this, AccueilActivity.class);
            startActivity(intent);
        } else if (id == R.id.concert) {

        } else if (id == R.id.festivales) {
            Intent intent = new Intent(this, festival.class);
            startActivity(intent);
        } else if (id == R.id.threatre) {
            Intent intent = new Intent(this, Theatre.class);
            startActivity(intent);
        } else if (id == R.id.Sport) {
            Intent intent = new Intent(this, Sport.class);
            startActivity(intent);
        } else if (id == R.id.Clendier) {
            Intent intent = new Intent(this, Calendar.class);
            startActivity(intent);
        } else if (id==R.id.Clendier){
            Intent intent = new Intent(this,CreateAccount.class);
            startActivity(intent);
        } else if(id==R.id.Contact){
            Intent intent = new Intent(this, Contact.class);
            startActivity(intent);
        }
        else if(id==R.id.login){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        else if(id==R.id.Create){
            Intent intent = new Intent(this, CreateAccount.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //pour essayer affichage des donnees du bd
    public void afficher_msg(String title,String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();
    }
}
