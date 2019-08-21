package mustdoprograms;

import java.util.List;

/***
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * SOLUTION :
 *
 *
 *
 */
public class AddTwoNumbersLinkedList {

    public static class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
    }

    public static ListNode addTwoNumber(ListNode list1, ListNode list2) {

        // Initialize current node to dummy head of the returning list.
        ListNode dummyHead = new ListNode(0);
        // Initialize p and q to head of list1 and list2 respectively.
        ListNode p = list1;
        ListNode q = list2;
        ListNode current = dummyHead;
        //Initialize carry to 0.
        int carry = 0;

        while (p != null || q != null) {
            //Set x and y  to node p's  q's value respectively. If p has reached the end of l1, set to 0
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // Set sum = x + y + carry
            int sum = carry + x + y;
            carry = sum/10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }

            if (carry > 0) {
                current.next = new ListNode(carry);
            }

        }
        return dummyHead.next;
    }
    public static void print(ListNode node) {

        ListNode current = node;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(4);

        addTwoNumber(first, second);
        print(first);
        print(second);
        print(addTwoNumber(first, second));

    }
}
