package algoExpert;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println();
        String  str ="abba";
        boolean result = isPalindrome(str);
        System.out.println(result);

    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() -1;
        if (str.length() == 0 ) {
           throw new IllegalArgumentException("string does not contain any character to check if it is palindrome.");
        }
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
