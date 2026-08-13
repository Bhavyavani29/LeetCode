class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = nums[n - 1];
        int j = nums[n - 2];
        int product = (i - 1) * (j - 1);
        return product;
    }
}