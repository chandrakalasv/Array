package com.bl.array;

public class AddArrayElements {
    public static void main(String[] args) {
        int[] elements = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
        System.out.println("sum of all the elements of an array:" + sum);
    }
    }
