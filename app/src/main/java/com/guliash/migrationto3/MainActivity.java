package com.guliash.migrationto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guliash.commons.ModelFromCommons;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelFromCommons.create(1, "2");
    }
}
