class Solution {
    public long maximumProduct(int[] nums, int m) {
        long Ans = Long.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int L = 0;
        int R = m - 1;
        while(R < nums.length){
            min = Math.min(nums[L], min);
            max = Math.max(nums[L], max);
            long minProduct = 1L * nums[R] * min;
            long maxProduct = 1L * nums[R] * max;
            Ans = Math.max(Ans, Math.max(minProduct, maxProduct));
            L++;
            R++;
        }
        return Ans;
    }
}