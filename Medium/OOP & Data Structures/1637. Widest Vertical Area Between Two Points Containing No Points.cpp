/*
Given n points on a 2D plane where points[i] = [xi, yi], 
Return the widest vertical area between two points such that no points are inside the area.

A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). 
The widest vertical area is the one with the maximum width.

Note that points on the edge of a vertical area are not considered included in the area.
*/
class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        priority_queue<int> heap;
        for (int i = 0; i < points.size(); i++) {
            heap.push(points[i][0]);
        }
        int maxDiff = 0;
        while (heap.size() > 1) {
            int prev = heap.top();
            heap.pop();
            maxDiff = max(maxDiff, prev - heap.top());
        }
        return maxDiff;
    }
};