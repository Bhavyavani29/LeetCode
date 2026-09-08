class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums) 
            total += num;
        int l = 0, lsum = 0;
        while(l < nums.length){
            int rsum = total - lsum - nums[l];
            if(lsum == rsum){
                return l;
            }
            lsum += nums[l];
            l++;
        }
        return -1;
    }
}