package com.ravirathee.a203_practice_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String string = extras.getString("B");
        Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
    }
}
