package datastructure.queueimplementation;

import datastructure.stackimplementation.LinkedListNode;

public class LLBasedQueue implements MyQueue {

    public LinkedListNode front, rear;
    int currentSize;

    public LLBasedQueue() {
        this.front = null;
        this.rear = null;
        this.currentSize =0;
    }



    @Override
    public boolean isFull() {
        // LinkedList based queue is dynamic in nature.
        return false;
    }

    @Override
    public boolean isEmpty() {

        return (currentSize == 0);
    }

    @Override
    public void enqueue(int data) {
        LinkedListNode oldrear = rear;
        rear = new LinkedListNode();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldrear.next = rear;
        }
        currentSize++;
        System.out.println(data + " is added to queue.");

    }

    @Override
    public void dequeue() {
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        currentSize--;
        System.out.println(data + " has been removed.");

    }
}
