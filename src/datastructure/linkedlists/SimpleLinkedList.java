package datastructure.linkedlists;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class SimpleLinkedList<T> implements SimpleList<T> {

    private Node<T> head = null;

    @Override
    public void add(final T value) {

        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = new Node<>(value);
        }
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {

        // Instantiating an anonymous class conforming to type Iterator
        return new Iterator<>() {

            private Node<T> next = head; // Initialization, class variable

            @Override
            public boolean hasNext() {
                //condition check
                return next != null;
            }
            @Override
            public T next() {
                //update
                final Node<T> temp = next;
                next = next.next;
                return temp.value;
            }
        };
    }

    static class Node<T> {

        private T value;

        private Node<T> next;

        Node(final T value) {
            this(value, null);
        }

        public Node(final T value, final Node<T> next) {
            this.value = value;
            this.next = next;
        }

        void setNext(final Node<T> aNext) {

            this.next = aNext;
        }

        void setValue(final T value) {

            this.value = value;
        }
    }
}