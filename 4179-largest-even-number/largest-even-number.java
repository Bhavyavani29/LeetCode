class Solution {
    public String largestEven(String s) {
        int lastTwoIdx = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                lastTwoIdx = i;
                break;
            }
        }
        if (lastTwoIdx == -1) {
            return "";
        }
        return s.substring(0, lastTwoIdx + 1);
    }
}