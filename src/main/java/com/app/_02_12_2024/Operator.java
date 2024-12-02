package com.app._02_12_2024;

public class Operator {
    public static void main(String[] args) {
        int a = 3;

        if(a == 2) {
            System.out.println("A");
        } else {
            System.out.println("C");
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println("C " + i);
            } else {
                System.out.println("D " + i);
            }
        }

        int x = 5;


        System.out.println(x++ + ++x);
        System.out.println(x);



        String s = "5";
        int c = 5;

        System.out.println(s+(c+c));
    }
}
