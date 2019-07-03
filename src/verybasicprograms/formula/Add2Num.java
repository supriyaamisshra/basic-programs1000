package verybasicprograms.formula;

import java.util.Scanner;

public class Add2Num {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers : ");
        int FirstNum = scan.nextInt();
        int SecondNum = scan.nextInt();
        int sum = 0;
        sum = FirstNum+ SecondNum;
        System.out.println(sum);
    }
}
