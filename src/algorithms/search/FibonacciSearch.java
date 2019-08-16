package algorithms.search;

import org.jetbrains.annotations.NotNull;

/***
 * Fibonacci Search method of searching a sorted array using a divide and conquer algorithm that narrows
 * down possible locations with the aid of Fibonacci numbers
 */

public class FibonacciSearch {

    private static int fibSearch(@NotNull int[] arr, int elementToSearch) {
        int fibFirst = 1;
        int fibSec = 0;
        int fibNum = fibFirst+ fibSec;
        int len = arr.length;

        while (fibNum < len) {
            fibSec = fibFirst;
            fibFirst = fibNum;
            fibNum = fibFirst + fibSec;
        }
        int offset = -1;
        while (fibNum > 1) {
            int i = Math.min(offset+fibSec, len);

            if (arr[i] < elementToSearch){
                fibNum = fibFirst;
                fibFirst = fibSec;
                fibSec = fibNum - fibFirst;
                offset = i;

            } else if (elementToSearch > arr[i]) {
                fibNum = fibSec;
                fibFirst = fibFirst - fibSec;
                fibSec = fibNum - fibFirst;

            } else {
                return i;
            }
        }
        if (fibFirst ==1 && arr[offset+1] == elementToSearch) {
            return offset+1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int index = fibSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println(index);
    }
}
