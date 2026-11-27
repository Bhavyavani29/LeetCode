class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the only case that overflows 32-bit signed integer
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine if the result should be negative using XOR
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;

        // Check bits from 31 down to 0 in a single O(log N) pass
        for (int i = 31; i >= 0; i--) {
            if ((n >> i) >= d) {
                ans += (1L << i);
                n -= (d << i);
            }
        }

        // Apply sign without using the '*' operator
        return isNegative ? (int) -ans : (int) ans;
    }
}