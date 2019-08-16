package algorithms.search;

import java.util.Arrays;
import java.util.Map;

/***
 * Exponential Search is used to search elements by jumping in exponential positions i.e. in powers of 2.
 * basically we minimise the range to perform binary search.
 * Worst Time Complexity : O(log(N))
 * Space Complexity :  O(1) for iterative BS
 * Space Complexity :O(log(N)) for recursive BBS
 */

public class ExponentialSearch {

    private static int expoSearch(int[] arr, int elementToSearch) {
        int startIndex = 0;
        int lastIndex = arr.length-1;

        if (arr[0] == elementToSearch) {
            return 0;
        }
        if (arr[lastIndex] == elementToSearch) {
            return lastIndex;
        }
        int range=1;
        while (range < arr.length && arr[range] <= elementToSearch) {
            // Jump exponentially
            range = range << 1;


        }
        /**
         * Min(range, lastIndex) :setting the last index which
         */
        return Arrays.binarySearch(arr,range/2, Math.min(range, lastIndex),elementToSearch);
    }

    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,6,7,8,9,10,11,12};
        int index =  expoSearch(arr,14);
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("Not Found.");
        }
    }


}
