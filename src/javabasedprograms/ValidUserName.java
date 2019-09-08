package javabasedprograms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/valid-username-checker/problem
 * he username consists of 8 to 0 characters inclusive. If the username
 * consists of less than 8 or greater than 30 characters, then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character
 * set consisting of lowercase characters(a-z) , uppercase characters(A-Z) , and digits [0-9] .
 * The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or
 * uppercase character [A-Z] .
 *
 * Sample Input 0
 *
 * 8
 * Julia
 * Samantha
 * Samantha_21
 * 1Samantha
 * Samantha?10_2A
 * JuliaZ007
 * Julia@007
 * _Julia007
 * Sample Output 0
 *
 * Invalid
 * Valid
 * Valid
 * Invalid
 * Invalid
 * Valid
 * Invalid
 * Invalid
 */
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
