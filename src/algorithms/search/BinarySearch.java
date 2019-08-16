package algorithms.search;


/** Binary Search : also known as half-interval search, logarithmic search, or binary chop,
 * is a search algorithm that finds the position of a target value within a sorted array.
 * Binary search compares the target value to the middle element of the array.
 * If they are not equal, the half in which the target cannot lie is eliminated and
 * the search continues on the remaining half,
 * again taking the middle element to compare to the target value,
 * and repeating this until the target value is found.
 * If the search ends with the remaining half being empty, the target is not in the array.
 *
 * Facts :
 * Binary search works on sorted arrays.
 * Time Complexity of Binary Search O(log n)
 * Binary searching can only be applied to a collection that allows random access (indexing).
 * Worst case performance: O(log n)
 * Best case performance: O(1)
 *
 */
public class BinarySearch {

    public static int bSearch(int[] arr, int num) {
        int start = 0;
        int endIndex = arr.length -1;
        if (start == endIndex) {
            return num;
        }
        // Q: break condition for program
        // Ans : till there is a difference between start and end index, where start < end.
        while (start <= endIndex) {
            int mid = (start + endIndex) /2;
            if (num == arr[mid]) {
                System.out.println("Number found " + num);
                return num;
            }
            if (num < arr[mid]) {
                //if num is not present less than the mid, shift endIndex to left of the mid.
                endIndex = mid - 1;
            } else {
                // if num is greater than the mid, shift start index right to the mid.
                start = mid + 1;
            }

        }
        System.out.println("Number not found " + num);
        return -1;
    }

    public static void main(String[] args) {

        int[] sortedArray = new int[] {2,3,4,5,6,7,8,53,67,78,89};
        int search = 82;
        bSearch(sortedArray,search);
    }



}
