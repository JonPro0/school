package test;

import util.ArrayGenerator;

import java.util.Arrays;

public class TestArrayGenerator {
    public static void main(String[] args) {
       // int[] a = ArrayGenerator.randomNumbers(10, 10000, 1);
        // System.out.println(Arrays.toString(a));
        

        int[] b;
        b = ArrayGenerator.randomNumbers2(10, 11);
        System.out.println(Arrays.toString(b));
        

    }
}