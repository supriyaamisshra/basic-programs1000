package verybasicprograms.datastructure.queueimplementation;

public class ArrayBasedQueue implements MyQueue{


    int capacity;
    int front;
    int rear;
    int currentSize;
    int queueArr[];

    public ArrayBasedQueue(int currentSize) {

        this.capacity = currentSize;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.queueArr = new int[this.capacity];
    }


    @Override
    public boolean isFull() {

        return (capacity == currentSize);
    }

    @Override
    public boolean isEmpty() {
        return (currentSize == 0);
    }
        // add element into Queue
    @Override
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add elements.");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }// why rear set to 0
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data +" added to queue successfully.");
        }
    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty cannot dequeue any element.");

        } else {
            front++;
            if (front == capacity -1) {
                System.out.println(queueArr[front-1] + " removed from queue.");
                front = 0;
            } else {
                System.out.println(queueArr[front-1] + " removed from queue.");
            }
            currentSize--;
        }

    }
}
