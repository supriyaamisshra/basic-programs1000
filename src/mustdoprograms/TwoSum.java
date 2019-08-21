package mustdoprograms;

import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;

/***
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    // Brute force approach

    public static void main(String[] args) {
        int[] result = TwoSum.searchBruteForce(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = TwoSum.searchBruteForce(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

        int[] resultBytwoPointer = TwoSum.searchTwoPointer(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("M 2 : Pair with target sum: [" + resultBytwoPointer[0] + ", " + resultBytwoPointer[1] + "]");
        resultBytwoPointer = TwoSum.searchTwoPointer(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("M 2 : Pair with target sum: [" + resultBytwoPointer[0] + ", " + resultBytwoPointer[1] + "]");


        int[] resultByHashMap = TwoSum.searchByHashMap(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("M 3 : Pair with target sum: [" + resultByHashMap[0] + ", " + resultByHashMap[1] + "]");
        resultByHashMap = TwoSum.searchTwoPointer(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("M 3 : Pair with target sum: [" + resultByHashMap[0] + ", " + resultByHashMap[1] + "]");

    }

    private static int[] searchByHashMap(int[] arr, int target) {
        // TC O(N) only once traversed and look up O(1)
        // SC O(N)

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            int targetDiff = target - arr[i];
            if (map.containsKey(targetDiff)) {
                return new int[] {map.get(targetDiff), i};
            }
            map.put(arr[i], i );

        }
    throw new IllegalArgumentException("No pair found for the given sum.");
    }

    private static int[] searchTwoPointer(int[] arr, int target) {
        // using two pointer TC : O(N)
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // comparing the sum of two numbers to the 'targetSum' can cause integer overflow
            // so, we will try to find a target difference instead "x+y = z" >> z = x-y
            int targetDiff = target - arr[left];
            if (targetDiff == arr[right])
                return new int[] { left, right }; // found the pair

            if (targetDiff > arr[right])
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
        return new int[] { -1, -1 };
    }

    private static int[] searchBruteForce(int[] ints, int target) {
        //cons : involves two loop TC O(N^2)

        for (int i = 0; i < ints.length; i++) {
            for (int k = i+1; k < ints.length ; k++) {
                // to avoid integer overflow solving on the basis  target = i + j ,i = target - j
               if ( ints[k] == target - ints[i]) {
                   return new int[] {i,k};
               }

            }


        }
        throw new IllegalArgumentException("No pair found");
    }
}
