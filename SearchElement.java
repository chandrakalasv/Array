package com.bl.array;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want in array");
        n = sc.nextInt();
        int[] elements = new int[n];
        System.out.println("enter the elements");
        for(int i = 0; i < elements.length; i++) {
            elements[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int number = sc.nextInt();
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == number) {
                flag = 1;
                break;
            }
            else {
                flag = 0;
            }
        }

        if(flag == 1) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
