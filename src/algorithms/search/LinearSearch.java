package algorithms.search;

public class LinearSearch {


    private static int search(int[] array, int number) {

        int len = array.length;

        // if Array is empty.

        if (len == 0) {
            System.out.println("Oops! Array is empty.");
            return -1;
        }
        // Search through out the array.
        for (int i = 0; i < len ; i++) {
            if (len > 0) {
                if ( array[i] == number) {
                    System.out.println("Yay! " + number + " is present.");
                    return number;
                } else {
                    System.out.println(number + " is not present.");
                    return -1;

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Initialise input array.
        int[] array = new int[] {1,3,5,6,7,8,9,13,46,76,67,676,78,787,54,65,76,87,67,87,97,44,4,2,24};
        search(array, 90);

    }
}
