/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol = new ListNode(0);
        ListNode curr = l1, curr2 = l2, currX = sol;
        int remainder = 0;
        
        while (curr != null || curr2 != null || remainder > 0) {
            int sum = remainder;
            if (curr != null) {
                sum += curr.val;
                curr = curr.next;
            }
            if (curr2 != null) {
                sum += curr2.val;
                curr2 = curr2.next;
            }
            
            currX.val = sum % 10;
            remainder = sum/10;
            
            if (curr != null || curr2 != null || remainder > 0) {
                currX.next = new ListNode(0);
                currX = currX.next;
            }
        }
        
        return sol;
    }
}