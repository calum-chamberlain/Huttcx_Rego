package com.huttcross.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Sign_on extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.huttcross.registration.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_on);
    }

    /** Called when the user clicks the Member button */
    public void memberSignOn(View view) {
        // Do something in response to button press
        Intent intent = new Intent(this, MemberSignOn.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Non-Member button */
    public void nonmemberSignOn(View view) {
        // Do something in response to button press
        Intent intent = new Intent(this, NonMemberSignOn.class);
        startActivity(intent);
    }
}
