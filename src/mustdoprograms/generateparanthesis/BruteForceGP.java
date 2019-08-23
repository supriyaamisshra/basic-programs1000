package mustdoprograms.generateparanthesis;

import java.util.ArrayList;
import java.util.List;

/****
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * Algo :
 *
 * To generate all sequences, we use a recursion. All sequences of length n is
 * just '(' plus all sequences of length n-1, and then ')' plus all sequences of length n-1.
 * To check whether a sequence is valid, we keep track of balance, the net number of opening brackets minus closing brackets.
 * If it falls below zero at any time, or doesn't end in zero, the sequence is invalid - otherwise it is valid.
 *
 *
 */

public class BruteForceGP {

    public static List<String> generateParanthesis(int n) {
        // Declared result List type which will be having String array of n*2 capacity.
        List<String> combinations = new ArrayList<>(n*2);
        generateAll(new char[2*n], 0, combinations);
        System.out.println("Possible balanced combinations of parenthesis are  for " + n);
        for (String s: combinations) {
            System.out.println(s);
        }
        return combinations;
    }

    private static void generateAll(char[] current, int pos, List<String> result) {

        // the constrain is we cannot generate ')' before "("
        // to maintain it balanced, we can generate right parenthesis only if count of left parenthesis is
        // more than right parenthesis.
        if (pos == current.length) {  //
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current,pos+1,result);
        }

    }
    // if all left parenthesis is paired then not a valid generation.

    private static boolean valid(char[] current) {
        int balance = 0;
        for (char item:current ) {
            if (item == '(' ) {
                balance++;
            } else {
                balance--;
            } if ( balance < 0) {
                return false;
            }

        }
        return (balance == 0);
    }

    public static void main(String[] args) {

        generateParanthesis(3);
        generateParanthesis( 5);
    }


}


