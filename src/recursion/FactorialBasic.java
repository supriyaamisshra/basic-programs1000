package recursion;

import java.util.Scanner;

public class FactorialBasic {

    public static long fact(long num) {
        if (num < 0) {
            throw new RuntimeException("Underflow error in function");
        } else if (num > 20) {
            throw new RuntimeException("Overflow error in function");
        } else if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers : ");
        long FirstNum = scan.nextLong();
        System.out.println(fact(FirstNum));

    }
}
