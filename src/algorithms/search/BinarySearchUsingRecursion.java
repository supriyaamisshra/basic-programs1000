package algorithms.search;


/**
 * Refer to BinarySearch for basic details about binary Search.
 * Here finding Index of the key using binary search algorithm with recursive approach.
 */

public class BinarySearchUsingRecursion {


    private static int bSearch(int[] arr, int start, int end, int key) {

        if (start < end) {

            int mid = start+ (end - start) /2;


            if (key < arr[mid]) {
                return bSearch(arr,start,mid,key);

            } else if (key > arr[mid]) {

                return bSearch(arr,mid+1,end,key);
            }
            return mid;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        int start = 0;
        int[] arr = new int[] {2,45,234,567,876,900,976,999};
        int end = arr.length - 1;
        int index = bSearch(arr,start,end,234);

        int index1 = bSearch(arr,start,end,900);
        System.out.println("Numbers found at " +index +" " +index1);

    }
}
