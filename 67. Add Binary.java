class Solution {
    public String addBinary(String a, String b) {
        String ret = "";
        if (b.length() < a.length()) { // a.length < b.length = true
            String t = b;
            b = a;
            a = t;
        }
        
        while (b.length() != a.length())
                a = '0' + a;
        
        boolean carry = false;
        
        for (int index = a.length() - 1; index >= 0; index--) {
            
            boolean first =  a.charAt(index) == '1';
            boolean second = b.charAt(index) == '1';
            
            int count = 0;
            if (first)
                count++;
            if (second)
                count++;
            if (carry)
                count++;
            
            carry = count > 1;
            ret =   count % 2 + ret;
            
            count = 0;
            
        }
        if (carry)
            ret = "1" + ret;
        
        return ret;
    }
}