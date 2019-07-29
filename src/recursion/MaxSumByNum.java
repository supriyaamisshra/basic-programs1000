package recursion;

/*
 * Recursively break a number in 3 parts to get maximum sum
 *
 * */

public class MaxSumByNum {
    public static int breakSum(int n) {
        if (n == 0 || n ==1) {
            return n;
        }
        return Math.max(breakSum(n/2)+breakSum(n/3)+breakSum(n/4), n);
    }
    public static void main(String[] args) {
        System.out.println(breakSum(12));
    }
}
