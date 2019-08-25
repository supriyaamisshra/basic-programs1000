package mustdoprograms;

import java.util.HashSet;
import java.util.Set;

/***
 * Explaination of "XOR"
 * 1 - 0001
 * 2 - 0010
 * 3 - 0011
 * 3 - 0011
 * 2 - 0010
 *
 * 1^1
 *
 * 0001
 * 0001
 * ----
 * 0000
 *
 * 2^2
 *
 * 0010
 * 0010
 * ----
 * 0000
 *
 * n^n = 0
 *
 * n^0 = n
 *
 * 0001
 * 0000
 * -----
 * 0001
 *
 */
public class SingleNumber {
    private static int findUniqueUsingXOR(int[] nums) {
        int result = 0;
        for (int n: nums) {
            result ^= n;
        }
        return result;
    }

    private static int findUniqueUsingSet(int[] numbs) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <numbs.length ; i++) {

            if (set.contains(numbs[i])) {
                set.remove(numbs[i]);
            } else {
                set.add(numbs[i]);
            }
        }
        assert set.size() == 1;
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] n = new int[] {2,2,1};
        int[] arr = new int[] {1,2,2,1,3,3,5};
        int result = findUniqueUsingXOR(arr);
        int output= findUniqueUsingXOR(n);
        int res = findUniqueUsingSet(arr);
        int r = findUniqueUsingSet(n);

        System.out.println(res);
        System.out.println(r);
        System.out.println(result);
        System.out.println(output);
    }
}
