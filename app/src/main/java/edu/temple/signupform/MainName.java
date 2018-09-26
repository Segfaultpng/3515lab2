package edu.temple.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainName extends AppCompatActivity {

    TextView nameviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_name);

        Intent intent = getIntent();
        String str = intent.getStringExtra("userfirstname");

        Log.v("HelloFromFirstActivity", str);

        nameviewer = (TextView) findViewById(R.id.namedisplayer);
        nameviewer.setText("Welcome "+ str + " to the SignUpForm App");
    }
}
