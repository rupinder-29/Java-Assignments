package String;

import java.util.Scanner;

public class PalindromeString {
//ex. MADAM
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //suer-input
        System.out.println("Enter a string");
        String s1 = scanner.next();
        //convert the string into lowercase
        s1 = s1.toLowerCase();
        //initialization and declaration of variables
        int i = 0;
        int j = s1.length() - 1;
        int n = s1.length();
        //while loop for to check the string
        while (i < n / 2) {
            if (s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
            }
                else {
                System.out.println("String is not palindrome");
                return;
                }

            }
        System.out.println("String is palindrome");

        }
    }
