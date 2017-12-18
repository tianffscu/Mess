package com.example.stream;

public interface Child extends Parent {


    @Override
    default void message() {
        System.out.println("Child message!");
    }
}
