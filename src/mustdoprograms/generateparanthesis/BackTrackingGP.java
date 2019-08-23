package mustdoprograms.generateparanthesis;


import java.util.ArrayList;
import java.util.List;

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

