package String;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        //input a string from user
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a string : ");
        String s1= scanner.next();
        //convert the string into lowercase
        s1=s1.toLowerCase();
        int count=0;
        int i=0;
        //condition check
        while (i<s1.length())
        {
            String s2= String.valueOf(s1.charAt(i));
            if (s2.contains("a")||s2.contains("e")||s2.contains("i")||s2.contains("o")||s2.contains("u"))
            {
                count ++;
            }
            i++;
        }
        //print no.of vowels
        System.out.println("no.of vowels is : " + count);
        // print no. of constants
        System.out.println("no. of constants is : "+ (s1.length()-count));
    }
}
