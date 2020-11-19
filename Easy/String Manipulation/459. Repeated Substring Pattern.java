class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0)
            return false;
        
        String sub = "";
        int loc = 0;
        
        while (sub.length() < s.length()/2) {
            
            sub += s.charAt(loc++);
            
            if (s.length() % sub.length() == 0) {
                
                String stemp = new String(s);
                
                if (stemp.replace(sub, "").length() == 0)
                    return true;
            }
            
        }
        
        return false;
    }
}