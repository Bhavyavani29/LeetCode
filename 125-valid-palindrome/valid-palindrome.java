class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s1).reverse().toString();
        if(s1.equals(reversed)) return true;
        else return false;
    }
}