package datastructure.stackimplementation;

public class ArrayToStack implements MyStack {
    int size;
    int[] arr;
    int top;

    public ArrayToStack(int size) {
        this.size = size;
        this.arr =  new int[size];
        this.top = -1;
    }


    @Override
    public void push(int pushedElement) {

        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println(pushedElement + " pushed into stack. ");
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int returnedElement = top;
            top--;
            System.out.println(arr[returnedElement] + " is evicted from stack.");
            return arr[returnedElement];
        } else {
            System.out.println("Stack is Empty.");
            return -1;
        }
    }

    @Override
    public int peek() {

        if (!this.isEmpty()) {
            System.out.println(arr[top] + " peeked element");
            return arr[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {

        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (size -1 == top);
    }




}
