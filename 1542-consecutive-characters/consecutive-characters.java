class Solution {
    public int maxPower(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}
