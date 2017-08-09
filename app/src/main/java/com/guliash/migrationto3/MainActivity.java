package com.guliash.migrationto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.guliash.commons.ModelFromCommons;
import com.guliash.models.ModelFromModels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelFromModels.create(1, "2");

        ModelFromCommons.create(1, "2");
    }
}
