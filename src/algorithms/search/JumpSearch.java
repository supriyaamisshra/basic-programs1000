package algorithms.search;


import org.jetbrains.annotations.NotNull;

/***
 * Jump search is another form of binary search, which only makes jump in forward direction unlikely BS,
 * In BS we look for the element in both side of the mid, here we jump in sqrt of array length.
 * Time Complexity : O(sqrt(N))
 * Space Complexity : O(1)
 *
 */
public class JumpSearch {

    private static int jumpSearch(@NotNull int[] array, int elementToSearch) {
        int len = array.length;
        int prevStep = 0;
        int jumpStep = (int ) Math.sqrt(array.length);
        while (array[Math.min(jumpStep, len) -1] < elementToSearch) {
            prevStep = jumpStep;
            jumpStep += (int) Math.sqrt(array.length);

            if (prevStep >= len) {
                return  -1;
            }
        }
        while (array[prevStep] < elementToSearch) {
            prevStep++;
            if (prevStep == Math.min(jumpStep, len)){
                return -1;
            }
        }
        if (array[prevStep] == elementToSearch) {
            return prevStep;
        }
        return -1;
   }

    public static void main(String[] args) {
        int index = jumpSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println(index);
    }
}
