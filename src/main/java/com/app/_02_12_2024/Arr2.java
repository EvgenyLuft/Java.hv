package com.app._02_12_2024;

import java.util.Arrays;
import java.util.Random;

public class Arr2 {
    public static void main(String[] args) {
        int[] testArr = new int[10];
        Random random = new Random();

        String s = "jjjj";

        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(testArr));

        for (int i = 0; i < testArr.length; i++) {
            if(testArr[i] % 2 == 0){
                System.out.println("EVEN: " + testArr[i]);
            }
        }
    }
}