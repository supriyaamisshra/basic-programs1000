package verybasicprograms.recursion;

import java.util.Scanner;

public class PossibleBSTCount {
    /*
    * By using catalan number formula
    * */

    static int countPossibleBST(int num) {
        if (num == 1 || num == 0 ){
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <=num ; i++) {
            int f = countPossibleBST(i - 1);
            int s = countPossibleBST(num - i);
            sum += f*s;

        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num = scan.nextInt();

        System.out.println(countPossibleBST(num));
    }
}
