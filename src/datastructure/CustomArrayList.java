package datastructure;

import javax.naming.spi.ObjectFactoryBuilder;
import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};

    public CustomArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) {
        if (size == INITIAL_CAPACITY) {
            ensureSize();
        }
        elementData[size++] = e;
    }

    public void ensureSize() {
        int newSize = elementData.length *2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("This index is invalid.");
        }
        return (E) elementData[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Object removeElement =  elementData[index];
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i+1];
        }
        return removeElement;
    }
    public void display() {

        System.out.println("displaying");

        for (int i = 0; i < size ; i++) {
            System.out.println(elementData[i] + " ");

        }
    }

}

class ListApp {

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.display();

        list.add(9);
        list.display();

        list.remove(2);
        list.display();
        list.display();
        System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + list.get(1));
        list.display();

    }

}