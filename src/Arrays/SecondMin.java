package javaassignments.arrays;

import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        // user-input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        //initialization
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //sorting an array in ascending order
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("the Sorted array is: " + arr[i]);
        }
        // SecondMin element in the array
        if (arr[0] != arr[1]) {
            System.out.println("the SecondMax element is: " + arr[1]);
        }
    }
}
