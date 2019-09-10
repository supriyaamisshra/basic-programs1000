package javabasedprograms.java8newfeatures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/***
 * Whenever we need to traverse through a Collection, we need a Iterator to traverse over, and then we have business logic
 * in a loop for each of the element in Collection.
 * We might get ConcurrentModificationException if Iterator is not used properly.
 *
 */
public class ForEachIterableInterface {

    public static void main(String[] args) {
        // sample collection
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(i);
        }
        // traversing using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator value" +i);
        }

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value:: " + t);
            }
        });
        list.forEach(t -> System.out.println(" for Each using lambda:: " + t));

        MyConsumer action = new MyConsumer();
        list.forEach(action);
    }

}
