package com.vaibhavmojidra.androidjavademo2dagger2singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MyTag","--------------");
        ((PlayGameApplication) getApplication()).playGameComponent.getPlayGame().playGame();
    }
}