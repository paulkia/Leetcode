class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        int rev = 0;
        x = Math.abs(x);
        while (x > 0) {
            int prev = rev;
            rev += x % 10;
            
            if(rev - x % 10 != prev)
                return 0;
            prev = rev;
            x /= 10;
            if (x > 0) {
                rev *= 10;
                if (rev/10 != prev)
                    return 0;
            }
        }
        if (negative)
            rev *= -1;
        return rev;
    }
}