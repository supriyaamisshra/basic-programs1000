package verybasicprograms.recursion;

import java.util.Scanner;

public class PalindromeStringFinder {

    public static boolean check( String str, int startIndex, int endIndex) {
        if (startIndex == endIndex || endIndex == 0) {
            return true;

        }
        if (str.charAt(startIndex) != str.charAt(endIndex-1)) {
            return  false;
        }
        if (startIndex < endIndex + 1) {
            check(str, startIndex +1, endIndex-1);
        }
        return  true;
    }
   /* public static boolean isPalindrome( String str) {
        int n = str.length();
        if (n == 0) {
            return true;
        }
        return check(str, 0 , n-1);
    }*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter String : ");
        String str = scan.nextLine();
        //isPalindrome(str);
        int endIndex = str.length();

        check(str, 0, endIndex);
        if (check(str,0, endIndex)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
