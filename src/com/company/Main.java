package com.company;

public class Main {
    public static void main(String args[]) {
        int a = 0;
        int b = 10;

        System.out.println(a + " " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
    }
}

