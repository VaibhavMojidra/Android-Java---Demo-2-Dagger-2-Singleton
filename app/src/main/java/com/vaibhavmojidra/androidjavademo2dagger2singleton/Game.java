package com.vaibhavmojidra.androidjavademo2dagger2singleton;

import android.util.Log;

import javax.inject.Inject;

public class Game {
    @Inject
    public Game() {
        Log.i("MyTag","Game class initialized.");
    }

    void isGameDownloaded(){
        Log.i("MyTag","Game is already downloaded.");
    }
}
