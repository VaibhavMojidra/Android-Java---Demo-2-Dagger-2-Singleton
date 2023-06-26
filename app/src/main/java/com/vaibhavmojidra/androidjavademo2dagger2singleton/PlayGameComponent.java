package com.vaibhavmojidra.androidjavademo2dagger2singleton;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface PlayGameComponent {
    PlayGame getPlayGame();
}
