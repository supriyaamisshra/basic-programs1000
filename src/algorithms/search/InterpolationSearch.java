package algorithms.search;
/**
 * Interpolation Search : this is an improved variant of binary search.
 * This search algorithm works on the probing position of the required value.
 * Runtime complexity of interpolation search algorithm is Ο(log (log n))
 * Conditions to apply Interpolation :
 *  Uniformly distributed array
 *  Sorted array
 *
 *  Formula to get position :
 *  Position Index = LI + ((( elementtosearch - element[LI])/(element[HI] - element[LI])) *  (HI - LI))
 *
 *  * Best Time Complexity : O(log log N)
 *  Worst when Array is not uniform :O(N)
 *  * Space Complexity :  O(1)
 */

public class InterpolationSearch {

    public static int interpolationSearch(int[] array, int elementToSearch) {

        int startIndex = 0;
        int endIndex = array.length -1;


        while (startIndex <= endIndex && elementToSearch >= array[startIndex] && elementToSearch <= array[endIndex]) {
            // using interpolation formulae to find the best probable position for this element to exist

            int pos = startIndex + (((endIndex-startIndex) /
                    (array[endIndex]-array[startIndex]))*
                    (elementToSearch - array[startIndex]));

            if (array[pos] == elementToSearch) {
                return pos;
            } else if (array[pos] < elementToSearch) {
                startIndex = pos + 1;
            } else {
                endIndex = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int index = interpolationSearch(new int[]{2,4,6,8,10,12,14,16,18,20}, 6);
        System.out.println( "Index : "+ index);

    }


}
