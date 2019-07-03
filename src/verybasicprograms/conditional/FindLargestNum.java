package verybasicprograms.conditional;

import java.util.Scanner;

public class FindLargestNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbebrs :" );
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b && a >=c) {
            System.out.println("largest number is : "+ a);
        } else if (b >= a && b >= c) {
            System.out.println("largest num is : " + b);
        } else {
            System.out.println("largest num is : "+ c);
        }

    }
}

