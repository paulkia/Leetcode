class Solution {
    public static String addStrings(String num1, String num2) {

        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num1.length() != num2.length()) {
            num1 = "0" + num1;
        }

        int remainder = 0;
        String ret = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            int num1d = num1.charAt(i) - 48;
            int num2d = num2.charAt(i) - 48;
            int sum = num1d + num2d + remainder;
            remainder = sum/10;
            ret = sum % 10 + ret;
        }
        if (remainder > 0)
            ret = remainder + ret;
        return ret;
    }
}