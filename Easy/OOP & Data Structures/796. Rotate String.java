class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B))
            return true;
        Queue<Character> aq = new LinkedList<>();
        Queue<Character> bq = new LinkedList<>();
        for (int i = 0; i < A.length(); i++) {
            aq.add(A.charAt(i));
            bq.add(B.charAt(i));
        }
        for (int i = 0; i < A.length(); i++) {
            if (aq.equals(bq))
                return true;
            bq.add(bq.remove());
        }
        return false;
    }
}