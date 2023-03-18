package com.fmi.exceptions;

import java.io.IOException;

public class ExceptionMain {

    public static void main(String... args) throws Exception {

        try {
            doSomething(true);
            System.out.println("After test method");
        } catch (IOException | NullPointerException e) {
            System.out.println("catch IOException");
        } catch (Exception e) {
            System.out.println("catch Exception");
        } finally {
            System.out.println("Finally ");
        }

    }
    public static void doSomething(boolean flag) throws Exception {
        if (flag) {
            throw new Exception();
        } else {
            throw new IOException();
        }
//        System.out.println("OK");
    }
}
