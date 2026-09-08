class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int total = 0, rsum = 0, lsum = 0;
        for(int i = 0;i < n;i++){
            total += nums[i];
        }
        for(int i = 0;i < n;i++){
            rsum = total - lsum - nums[i];
            if(rsum == lsum)
                return i;
            lsum = lsum + nums[i];
        }
        return -1;
    }
}