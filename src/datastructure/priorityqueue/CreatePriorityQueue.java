package datastructure.priorityqueue;

import java.util.PriorityQueue;

/***
 * create a Priority Queue of integers and add some integers to it.
 * After adding the integers, we’ll remove them one by one from the
 * priority queue and see how the smallest integer is removed first
 * followed by the next smallest integer and so on.
 */
public class CreatePriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        PriorityQueue<String>  namePriorityQueue = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
        while (!namePriorityQueue.isEmpty()) {
            System.out.println("names :" +namePriorityQueue.remove());
        }


    }
}
