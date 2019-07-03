package verybasicprograms.conditional;

import java.util.Scanner;

public class FindLargestNestedIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbebrs :" );
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b) {
            if (a >= c && c >= b) {

                System.out.println(a + " is greatest.");

            } else {

                System.out.println(c + " is greatest.");
            }
        } else {

            if (b >= c) {

                System.out.println(b + " is greatest");

            } else {

                System.out.println(c + " is greatest.");
            }

        }

    }



}
