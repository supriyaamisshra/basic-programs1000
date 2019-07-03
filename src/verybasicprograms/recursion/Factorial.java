package verybasicprograms.recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers : ");
        int FirstNum = scan.nextInt();
        System.out.println(fact(FirstNum));
    }
}
