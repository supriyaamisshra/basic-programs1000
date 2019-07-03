package verybasicprograms.datastructure.stackimplementation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasedStack implements MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;



    public QueueBasedStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    @Override
    public void push(int n) {
        if (q1.size() == 0) {
            q1.add(n);
        } else {
            int q1Size = q1.size();
            for (int i = 0; i < q1Size; i++) {
                q2.add(q1.remove());
            }
            q1.add(n);
            for (int j = 0; j < q1Size; j++) {
                q1.add(q2.remove());

            }
        }

    }

    @Override
    public int pop() {
        if (q1.size() == 0) {
            throw new QueueException("Under Flow Exception");
        }
        return q1.remove();
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
