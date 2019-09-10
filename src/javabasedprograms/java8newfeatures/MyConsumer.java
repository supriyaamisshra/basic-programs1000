package javabasedprograms.java8newfeatures;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Consumer implemented value" + t);
    }
}
