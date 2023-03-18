package com.fmi.exceptions;

public class MyResourceDemo {

    public static void main(String[] args) {

        try (MyResource myResource = new MyResource();
                MyDocument myDocument = new MyDocument()) {

            myResource.useResource();
            myDocument.useResource();
        } catch (Exception ex) {
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}
