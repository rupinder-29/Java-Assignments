package javaassignments.arrays;

import java.util.Scanner;

public class MaxNumber {
    //main method
        public static void main(String[] args) {
           // user-input
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the elements: ");
            //initialization
            int[] arr = new int[5];
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                //maximum number
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("maximum element is : " + max);
        }
    }

