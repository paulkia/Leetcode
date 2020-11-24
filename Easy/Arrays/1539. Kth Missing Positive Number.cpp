/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Find the kth positive integer that is missing from this array.
*/
class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int count = 0;
        int id = 0;
        for (int i = 0; i < arr.size(); i++, id++) {
            while (arr[i] > id) {
                if (count == k) {
                    return id;
                }
                id++;
                count++;
            }
        }
        while (count != k) {
            count++;
            id++;
        }
        return id;
    }
};