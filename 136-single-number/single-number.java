class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer> s1 = hm.keySet();
        for(int x:s1)
        {
            if(hm.get(x) == 1)
            {
                return x;
            }
        }
        return -1;
    }
}