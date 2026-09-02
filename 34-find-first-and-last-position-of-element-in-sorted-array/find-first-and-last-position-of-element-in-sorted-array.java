class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    int findFirst(int[] nums, int target){
        int l = 0, h = nums.length - 1, idx = -1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if (nums[m] == target){
                idx = m;
                h = m - 1;
            } 
            else if (nums[m] < target){
                l = m + 1;
            } 
            else {
                h = m - 1;
            }
        }
        return idx;
    }
    int findLast(int[] nums, int target){
        int l = 0, h = nums.length - 1, idx = -1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(nums[m] == target){
                idx = m;
                l = m + 1;
            } 
            else if(nums[m] < target){
                l = m + 1;
            } 
            else{
                h = m - 1;
            }
        }
        return idx;
    }
}
