/*
The area of the rectangular web page you designed must equal to the given target area.
The width W should not be larger than the length L, which means L >= W.
The difference between length L and width W should be as small as possible.
Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
*/
class Solution {
public:
    vector<int> constructRectangle(int area) {
        vector<int> factorsDesc;
        vector<int> factorsAsc;
        factorsDesc.push_back(area);
        for (int i = 1, j = area / 2; i <= area / 2 && j > 0; i++, j--) {
            if (area % i == 0) {
                factorsAsc.push_back(i);
            }
            if (area % j == 0) {
                factorsDesc.push_back(j);
            }
        }
        factorsAsc.push_back(area);
        
        vector<int> result(2);
        int dif = area - 1;
        for (int i = 0; i <= factorsDesc.size() / 2; i++) {
            if (factorsDesc[i] * factorsAsc[i] == area && factorsDesc[i] - factorsAsc[i] <= dif) {
                // Unsure why factorsDesc[i] can be smaller than factorsAsc[i] so I used max/min
                result[0] = max(factorsDesc[i], factorsAsc[i]);
                result[1] = min(factorsDesc[i], factorsAsc[i]);
            }
        }
        return result;
    }
};