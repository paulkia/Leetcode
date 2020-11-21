/*
Given an integer n and an integer start.
Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums.

(Can be done in O(1) time, but I'm too tired to figure it out atm. The optimal solution is found here.)
	https://leetcode.com/problems/xor-operation-in-an-array/discuss/939190/O(1)-time-C%2B%2B-easy-to-understand
*/
class Solution {
public:
    int xorOperation(int n, int start) {
        int result = 0;
        for (int i = start, count = 0; count < n; i += 2, count++) {
            result ^= i;
        }
        return result;
    }
};