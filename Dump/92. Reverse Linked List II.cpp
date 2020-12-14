// F this problem. It was so painful. 4 wrong submissions due to so many edge cases.

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int m, int n) {
        if (head->next == NULL)
            return head;
        ListNode *pause = head, *play = head, *rev = head, *curr = head;
        int count = 0;
        while (count < n) {
            count++;
            if (count == m - 1) {
                pause = curr;
                play = curr->next;
            }
            if (count < m)
                curr = curr->next;
            else {
                ListNode* temp = curr;
                curr = curr->next;
                temp->next = rev;
                rev = temp;
            }
        }
        if (pause != NULL) {
            pause->next = rev;
        }
        if (play != NULL) {
            play->next = curr;
        }
        return m == 1 ? rev : head;
    }
};