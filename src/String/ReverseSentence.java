package String;

import java.util.Scanner;

public class ReverseSentence {
    //ex. " java is a programming language"  into  "language programming a is java"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:  ");
        String s1 = scanner.nextLine();
        String[] arr = s1.split(" ");
        int i=0 ;
        int j=arr.length-1;
        String temp;
        {
            while (i<=arr.length/2){
                temp = String.valueOf(arr[i]);
                arr[i] = arr[j - i];
                arr[j - i] = temp;
                i++;
            }
            System.out.println("The reversed sentence is : ");
            for (String elements: arr){
                System.out.print(elements+ " ");
            }

        }







        }
    }

