package verybasicprograms.datastructure.stackimplementation;

public class QStackMain {
    public static void main(String[] args) {
        QueueBasedStack stack = new QueueBasedStack();
        stack.push(20);
        stack.push(40);
        stack.push(70);
        stack.push(50);
        stack.push(90);
        stack.push(110);
        stack.push(30);
        System.out.println("Removed element : "+ stack.pop());
        stack.push(170);
        System.out.println("Removed element : "+ stack.pop());
    }
}
