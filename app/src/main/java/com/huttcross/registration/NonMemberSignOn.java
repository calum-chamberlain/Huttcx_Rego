package com.huttcross.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.huttcross.registration.RegisteredRiders;

public class NonMemberSignOn extends AppCompatActivity {

    private static final String FIRST_NAME = "com.huttcross.registration.FIRST_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_member_sign_on);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void putRacer(View view) {
        // Put racers details into the database /
        Intent intent = new Intent(this, RegisteredRiders.class);
        EditText editText = (EditText) findViewById(R.id.first_name);
        String firstname = editText.getText().toString();
        intent.putExtra(FIRST_NAME, firstname);
        startActivity(intent);
    }

}
