package verybasicprograms.formula;

import java.util.Scanner;

public class Add3Num {

    public static int total(int a, int b, int c) {
        int sum = 0;
        sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(total(a,b,c));
    }
}
