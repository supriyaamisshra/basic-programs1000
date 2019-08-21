package datastructure.linkedlists;

public interface SimpleList<T> extends Iterable<T> {

    void add(T value);

    boolean remove(T value);
}
