class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
            /*if (k != 0) {
                Arrays.sort(nums);
                nums[i] = -nums[i];
            } */
        }
        if (k % 2 != 0) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return sum;
    }
}