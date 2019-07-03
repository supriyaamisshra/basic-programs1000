package verybasicprograms.datastructure.stackimplementation;

import verybasicprograms.datastructure.stackimplementation.ArrayToStack;

public class ArrayToStackMain {

    public static void main(String[] args) {

        ArrayToStack arrayToStack = new ArrayToStack(10);
        arrayToStack.pop();
        System.out.println("=============");
        arrayToStack.push(10);
        arrayToStack.push(12);
        arrayToStack.push(14);
        arrayToStack.push(16);
        System.out.println("=============");
        arrayToStack.peek();
        System.out.println(".....");
        arrayToStack.pop();
        arrayToStack.pop();
        arrayToStack.pop();
        arrayToStack.peek();

    }
}
