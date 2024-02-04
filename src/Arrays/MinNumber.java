package javaassignments.arrays;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array : ");
        int[] arr = new int[7];
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("the minimum element in the array is : "+min);

    }
}