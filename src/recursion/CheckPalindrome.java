package recursion;

import java.util.Scanner;

public class CheckPalindrome {

    public static  int isPal(int n, int temp){

        if (n==0) {
            return temp;
        }
        System.out.println(temp + " hey this before");
        temp = (temp * 10 ) + (n % 10);
        System.out.println("now temp " + temp);
        System.out.println(n/10 + " here is ");
        return isPal(n/10, temp);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers : ");
        int n = scan.nextInt();
        int temp = isPal(n, 0);

        if (temp == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
