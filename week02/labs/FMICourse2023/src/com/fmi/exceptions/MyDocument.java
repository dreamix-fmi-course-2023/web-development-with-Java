package com.fmi.exceptions;

public class MyDocument implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close my document");
    }

    public void useResource() throws Exception {
        System.out.println("Use my document");

    }
}
