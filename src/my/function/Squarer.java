package my.function;

import java.util.function.Function;

public class Squarer implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer n) {

        return n*n;
    }

    public static void main(String[] args) {
        int n = 2;

        final Squarer squarer = new Squarer();

        System.out.println(squarer.andThen(squarer).andThen(squarer).apply(2));
    }
}
