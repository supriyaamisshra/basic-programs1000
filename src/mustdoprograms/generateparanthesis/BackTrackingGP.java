package mustdoprograms.generateparanthesis;


import java.util.ArrayList;
import java.util.List;

/***
 * Instead of adding '(' or ')' every time as in brute force,
 * let's only add them when we know it will remain a valid sequence.
 * We can do this by keeping track of the number of opening and closing brackets we have placed so far.
 *
 * We can start an opening bracket if we still have one (of n) left to place.
 * And we can start a closing bracket if it would not exceed the number of opening brackets.
 *
 */
public class BackTrackingGP {


    public static void main(String[] args) {

        generateParenthesisBackTrackAlgo(3);
        generateParenthesisBackTrackAlgo( 5);
    }

    private static List<String> generateParenthesisBackTrackAlgo(int pair) {
        List<String> result = new ArrayList<>();

        directedGenerateBalancedParentheses(pair, pair, "", result);
        System.out.println("Possible parenthesis are for " + pair);
        for (String s: result) {
            System.out.println(s);
        }
        return result;
    }

    private static void directedGenerateBalancedParentheses(int leftCountParen, int rightCountParen, String parenStringInProgress, List<String> result) {

        if (leftCountParen == 0 && rightCountParen == 0) {
            result.add(parenStringInProgress);
            return;
        }
        if ( leftCountParen > 0) {
            directedGenerateBalancedParentheses( leftCountParen -1, rightCountParen, parenStringInProgress+ "(", result);
        }
        if (leftCountParen < rightCountParen ) {
            directedGenerateBalancedParentheses(leftCountParen, rightCountParen -1, parenStringInProgress + ")", result);
        }
    }
}

