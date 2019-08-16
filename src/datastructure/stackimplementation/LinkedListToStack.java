package datastructure.stackimplementation;

public class LinkedListToStack implements MyStack {

    public LinkedListNode head;

    public LinkedListToStack() {
        head = null;
    }


    @Override
    public void push(int data) {

        LinkedListNode oldHead = head;
        head = new LinkedListNode(data);
        head.next = oldHead;
    }

    @Override
    public int pop() {
        if (head == null) {
            System.out.println("LinkedList is empty.");
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }


}
