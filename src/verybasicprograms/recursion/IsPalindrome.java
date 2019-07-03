package verybasicprograms.recursion;

import java.util.Scanner;
/// WRONG PROGRAM
public class IsPalindrome {
    // A function returns when number is single digit

    public static int checkDigit(int num) {

        // check if num is single digit
        if ((num >=0) && ( num < 10)) {
            System.out.println("checkDigit called : " + num);
            return 1;
        } else {
            return 0;
        }
    }
    public static int isPalindrome(int num) {

        if (num < 0) {
            System.out.println("It was -ve num : changing into positive");
            num = (-num);
        }
            int copiedNum = (num);
            System.out.println("copy Number is "+ copiedNum);
        return checkPalindrome(num, copiedNum);

    }
    public static int checkPalindrome(int num, int copyNum) {
        // recursive function
        // base case for termination

        System.out.println("Starting checkPalindrome : ");
        System.out.println(checkDigit(num) + " if condition ");

        //========================

        if (checkDigit(num) == 1) {
            System.out.println("copy num % 10 " + (copyNum)%10);
            if (num == (copyNum) % 10) {
                System.out.println("I am called");
                return 1;
            } else {
                return 0;
            }
        }
        System.out.println("num/10 = " + num/10);
        System.out.println(" now copy  Num is "+ copyNum);
        if (checkPalindrome((int)(num / 10),copyNum) == 0) {
            return -1;
        }
        copyNum = (int) (copyNum/10);
        System.out.println("New Copy num  " + copyNum);

        if (num % 10 == (copyNum) % 10) {
            return 1;

        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int Num = scan.nextInt();
        if(isPalindrome(Num) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }


}
