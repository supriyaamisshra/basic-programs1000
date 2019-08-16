package datastructure.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/***
 * create a priority queue of String elements in which the String with the smallest length is processed first.
 *
 * We can create such a priority queue by passing a custom Comparator that compares two Strings by their length.
 *
 *
 */
public class PriorityQueueCustomComparator {


    public static void main(String[] args) {

        Comparator<String> stringLenComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        /*
        The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };

        Which can be shortened even further like this =>
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        */

        // Create a Priority Queue with a custom Comparator
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLenComparator);
        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
    }
}
