class Solution {
    public int maxProduct(int[] nums) {
        int CurrMax = nums[0];
        int CurrMin = nums[0];
        int Max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = CurrMax;
                CurrMax = CurrMin;
                CurrMin = temp;
            }
            CurrMax = Math.max(nums[i], CurrMax * nums[i]);
            CurrMin = Math.min(nums[i], CurrMin * nums[i]);
            Max = Math.max(Max, CurrMax);
        }
        return Max;
    }
}