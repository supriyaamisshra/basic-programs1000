package datastructure.queueimplementation;

public class ArrayBasedQueueMain {

    public static void main(String[] args) {
        ArrayBasedQueue queue = new ArrayBasedQueue(10);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(4);

        queue.dequeue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}
