package com.bl.array;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want in array");
        n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < numbers.length; i++) {
             numbers[i] = sc.nextInt();
        }
        System.out.println("The elements stored in array are");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
