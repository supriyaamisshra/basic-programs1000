package mustdoprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 */
public class NonDeCreasingArrayMethod2 {


    public boolean checkPossibilityByAnotherMethod(int[] nums) {
        int p = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (p != -1)  {
                    return false;
                }
                else {
                    p = i;
                }
            }
        }
        return (p == -1 ||   // no reversed pair
                p == 1 || p == nums.length - 1 ||  // reversed pair is first or last element
                nums[p - 2] <= nums[p] || nums[p - 1] <= nums[p + 1]); // normal case range [p-2 --> p+1] all valid
    }
}

class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);

            boolean ret2 = new NonDeCreasingArrayMethod2().checkPossibilityByAnotherMethod(nums);

            String out2 = booleanToString(ret2);

            System.out.println(out2);
        }
    }
}