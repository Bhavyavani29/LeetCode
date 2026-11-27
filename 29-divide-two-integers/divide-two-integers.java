class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n >> i) >= d) {
                ans += (1L << i);
                n -= (d << i);
            }
        }
        return isNegative ? (int) -ans : (int) ans;
    }
}