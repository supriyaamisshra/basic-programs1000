package javabasedprograms;

/***
 * an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 *
 * You are given code in the editor. Complete the code so that it prints the following lines:
 *
 * 1
 * 2
 * 3
 * Hello
 * World
 * Do not use method overloading because your answer will not be accepted.
 */
public class Generics
{


    private static void printArray(Object[] input) {
        for (Object o: input) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer[] number = {1,22,3};
        String[] str = {"Hello", "Supriya"};
        printArray(number);
        printArray(str);

    }
}
