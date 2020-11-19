/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        ListNode currOther = head;
        for (int i = 0; i < size / 2 + size % 2; i++) {
            currOther = currOther.next;
        }
        for (int i = 0; i < size / 2; i++) {
            curr = head;
            System.out.println(curr.val + "; " + currOther.val);
            for (int j = 0; j < size / 2 - i - 1; j++) {
                curr = curr.next;
            }
            if (curr.val != currOther.val)
                return false;
            currOther = currOther.next;
        }
        return true;
    }
}