package javaassignments.arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        // user-input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        //declaration of an array
        int[] arr = new int[5];
        //initializing
        int i, j = arr.length - 1;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //reverse an array
        for (i = 0; i <=n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.println("The reverse array is : " + arr[i]);
        }
    }
}



