package mustdoprograms;

/***
 *Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseString {

    private static void reverse(char[] chars) {
        int n = chars.length/2;
        int j =  chars.length -1;
        for (int i = 0; i <n ; i++) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            j--;
        }

    }

    public static void main(String[] args) {
    }

}
