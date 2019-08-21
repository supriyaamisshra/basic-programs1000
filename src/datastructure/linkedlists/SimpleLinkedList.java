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

            Node<T> head; // Initialization
            @Override
            public boolean hasNext() {
                //condition check
                Node<T> temp = head;
                if (temp != null) {
                    return temp.next != null;
                }
                return false;
            }
            @Override
            public T next() {
                //update
                Node<T> temp = head;
                head = head.next;
                return head.value;
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