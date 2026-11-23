class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            if(!hs.add(n)){
                hs.remove(n);
            }
        }
        int[] res = new int[2];
        int i = 0;
        for(int n : hs){
            res[i++] = n;
        }
        return res;
    }
}