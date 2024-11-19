package com.java15.service;

public class Service {

    public void displayTextBlock(){
        String block = """ 
                this is a example of block
                """;
        System.out.println(block);
    }

    public void stringFormatted(){
        String name = "Test string";
        int javaVersion = 15;

        String message = "Testing formatted string %s with java version %d".formatted(name, javaVersion);
        System.out.println(message);
    }
}
