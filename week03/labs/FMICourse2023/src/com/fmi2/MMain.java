package com.fmi2;

public class MMain {

    public static void main(String[] args) {
        B b = new B();
        b.name = "Protected";
        String name = b.name;
        System.out.println(name);
    }
}
