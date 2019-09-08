package javabasedprograms;

import java.util.Scanner;

public class ValidUserName {

    private static final String regex = "^[a-zA-Z]\\w{7,29}$";

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {

            System.out.println(n);
            String userName = scan.nextLine();
            if (userName.matches(regex)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }
}
