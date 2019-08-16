package datastructure.priorityqueue.priorityqueueifuserdefinedobjects;

import java.util.PriorityQueue;

/***
The requirement for a PriorityQueue of user defined objects is that

1. Either the class should implement the Comparable interface and provide
  the implementation for the compareTo() function.
2. Or you should provide a custom Comparator while creating the PriorityQueue.

 Notice how the Employee with the lowest salary is removed first.
 */

public class PriorityQueueUserDefinedObject {
     public static void main(String[] args) {
         PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

         // Add items to the Priority Queue
         employeePriorityQueue.add(new Employee("Rajeev", 100000.00));
         employeePriorityQueue.add(new Employee("Chris", 145000.00));
         employeePriorityQueue.add(new Employee("Andrea", 115000.00));
         employeePriorityQueue.add(new Employee("Jack", 167000.00));

        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
         while (!employeePriorityQueue.isEmpty()) {
             System.out.println(employeePriorityQueue.remove());
         }
     }
}
