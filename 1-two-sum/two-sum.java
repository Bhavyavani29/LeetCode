class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            int x = target - nums[i];
            if(!hs.contains(x))
                hs.add(nums[i]);
            else{
                int y = -1;
                for(int j = 0;j < nums.length;j++){
                    if(nums[j] == x){
                        y = j;
                        break;
                    }
                }
                return new int[]{i, y};
            }
        }
        return new int[]{-1, -1};
    }
}