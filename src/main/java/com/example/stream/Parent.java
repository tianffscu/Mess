package com.example.stream;

public interface Parent {

    void test();

    default void message() {
        System.out.println("Parent message!");
    }



}
