class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 0)
            return "";
        int start = 0, end = 0;
        for(int i = 0;i < s.length(); i++){
            int len1 = validOrNot(s, i, i);
            int len2 = validOrNot(s, i, i + 1);
            int maxLen = Math.max(len1, len2);
            if(maxLen > end - start + 1){
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    public static int validOrNot(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}