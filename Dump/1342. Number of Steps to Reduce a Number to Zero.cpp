class Solution {
public:
    int numberOfSteps (int num) {
        int steps = 0;
        if (num % 2 == 1) {
            num--;
            steps++;
        }
        while (num > 1) {
            num >>= 1;
            steps++;
            if (num % 2 == 1) {
                steps++;
            }
        }
        return steps;
    }
};