package mustdoprograms;

import java.util.List;

/***
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
class LinkedListNode {

        int val;
        LinkedListNode next;
        LinkedListNode(int x) {
            val = x;
        }
}
public class ReverseLinkedList {
    /* recursive solution */
    private static LinkedListNode reverse(LinkedListNode head) {

        return reverseLinkedList(head, null);

    }

    private static LinkedListNode reverseLinkedList(LinkedListNode head, LinkedListNode newHead) {
        if (head == null) {
            return newHead;
        }
        LinkedListNode next = head.next;
        head.next = newHead;
        return reverseLinkedList(next, head);
    }

    public static void print(LinkedListNode node) {

        LinkedListNode current = node;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }

        System.out.println();
    }

    /* iterative solution */
    public  static LinkedListNode reverseList(LinkedListNode head) {

        LinkedListNode newHead = null;
        while (head != null) {
            LinkedListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(1);
        first.next = new LinkedListNode(2);
        first.next.next = new LinkedListNode(4);
        LinkedListNode second = new LinkedListNode(5);
        second.next = new LinkedListNode(6);
        second.next.next = new LinkedListNode(4);
        //reverse(first);
        print(reverse(second));
        print(reverseList(first));

    }
}
