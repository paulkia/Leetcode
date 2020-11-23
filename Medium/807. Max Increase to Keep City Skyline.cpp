/*
Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation: 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]
*/
class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
        // NOTE: just writing "int result;" here results in a wrong answer. 
        // Perhaps we allocate memory previously containing garbage?
        // In this case, result begins at 4 without the 0-assignment.
        int result = 0;
        int maximumsRC[grid.size() * 2];
        for (int i = 0; i < grid.size(); i++) {
            int maxr = 0, maxc = 0;
            for (int j = 0; j < grid.size(); j++) {
                maxr = max(maxr, grid[i][j]);
                maxc = max(maxc, grid[j][i]);
            }
            maximumsRC[i] = maxr;
            maximumsRC[i + grid.size()] = maxc;
        }
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size(); j++) {
                result += min(maximumsRC[i], maximumsRC[j + grid.size()]) - grid[i][j];
            }
        }
        return result;
    }
};