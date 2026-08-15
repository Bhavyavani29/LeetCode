class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] sortedArray = nums.clone();
		Arrays.sort(sortedArray);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < sortedArray.length; i++) {
			if (!hm.containsKey(sortedArray[i])) {
				hm.put(sortedArray[i], i);
			}
		}
		int result[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = hm.get(nums[i]);
		}
		return result;
    }
}