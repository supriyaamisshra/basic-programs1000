package datastructure.linkedlists;

import java.util.Iterator;

public class ListRunner {

    public static void main(String[] args) {

        final SimpleList<Integer> integerList = new SimpleLinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // [Method 1]
        integerList.forEach(System.out::println);

        System.out.println("======");
        // [Method 2]
        for (Integer integer : integerList) {
            System.out.println(integer);

        }
        System.out.println("======");

        // [Method 3]
        Iterator<Integer> listIterator = integerList.iterator(); // should only do init
        while (listIterator.hasNext()) { // should only do condition check
            final Integer value = listIterator.next(); // should do an update
            System.out.println(value);
        }

        // Method 2 is a shortcut for method 3
        // Method 1 is a shortcut for method 2
    }
}
