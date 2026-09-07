class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
		Map<Integer,Integer> hm = new HashMap<>();
		int psum = 0;
		for(int i = 0;i < n;i++){
			psum += nums[i];
			if(psum == k)
				count++;
			if(hm.containsKey(psum-k))
				count += hm.get(psum-k);
			hm.put(psum,hm.getOrDefault(psum,0)+1);
		}
		return count;
    }
}