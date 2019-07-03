package verybasicprograms.recursion;

public class ReverseString {


    public  static String reverseRecursively(String str) {

       if (str.isEmpty()) {
           return str;
       }

        return reverseRecursively(str.substring(1))+str.charAt(0);
       // System.out.println(str.charAt(0));

    }

    public static void main(String[] args) {
        String s = "Welcome to Maple";
        String output = reverseRecursively(s);
        System.out.println(output);

    }
}
