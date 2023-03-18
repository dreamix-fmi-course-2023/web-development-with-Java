package com.fmi.exceptions;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close my resource");
    }

    public void useResource() {
        System.out.println("Use my resource");
    }
}
