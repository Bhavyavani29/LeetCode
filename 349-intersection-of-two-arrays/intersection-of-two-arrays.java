class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int i = 0;i < nums2.length;i++){
            if(hs.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }
}