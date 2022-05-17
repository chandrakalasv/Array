package com.bl.array;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        int temp = 0;
        int[] elements = {10, 20, 70, 60, 40};
        System.out.println("Elements of original array: ");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        for(int i = 0; i < elements.length; i++) {
            for(int j = i + 1; j < elements.length; j++) {
                if(elements[i] > elements[j]) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i =0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
