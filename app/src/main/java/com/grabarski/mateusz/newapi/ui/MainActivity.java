package com.grabarski.mateusz.newapi.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.grabarski.mateusz.newapi.R;
import com.grabarski.mateusz.newapi.services.MessageService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    MessageService messageService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.class.getSimpleName(), "onCreate: " + messageService.getMessage());
    }
}
