package Arrays;

import java.util.Scanner;

public class Adding2DArray {

    public static void main(String[] args) {
        /*Scanner scanner= new Scanner(System.in)
        System.out.println("enter ");*/

        int[][] arr1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] arr2 = {{2, 9, 48}, {5, 3, 6}, {3, 5, 12}};

        int[][] sum = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] elements : sum) {
            // second for...each loop access each element inside the row
            System.out.println( );
            for (int data : elements) {
                System.out.print(data+" ");
            }

        }
    }
}