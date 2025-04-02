/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = l1;
        ListNode listNode2 = l2;

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while (listNode != null || listNode2 != null || carry != 0) {
            int sum = carry;
            if (listNode != null) {
                sum += listNode.val;
                listNode = listNode.next;
            }
            if (listNode2 != null) {
                sum += listNode2.val;
                listNode2 = listNode2.next;
            }
            carry = sum / 10;
            final int sumFinal = sum % 10;
            current.next = new ListNode(sumFinal);
            current = current.next;

        }

        return dummy.next;
    }
}