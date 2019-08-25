package mustdoprograms;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the
 * multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * Example:
 * n = 15,
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class FizzBuzz {
    private static List<String> fizzBuzz(int number) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            if (i%3 ==0 && i%5==0) {
                result.add("FizzBuzz");
            } else if (i%3 == 0) {
                result.add("Fizz");
            } else if (i%5 == 0) {
                result.add("Buzz");

            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String > result = fizzBuzz(15);
        for (String s :result
             ) {
            System.out.println(s);

        }
    }
}
