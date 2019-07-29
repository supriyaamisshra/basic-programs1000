package datastructure.stackimplementation;

public class LinkedListStackMain {

    public static void main(String[] args) {
        LinkedListToStack lls = new LinkedListToStack();
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        System.out.println("Element removed from LinkedList: "+lls.pop());

        lls.push(10);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        printList(lls.head);
    }
    public static void printList(LinkedListNode head) {
        LinkedListNode tempNode = head;
        while (tempNode != null) {
            System.out.format("%d ",tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
