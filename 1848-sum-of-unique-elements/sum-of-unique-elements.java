class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer> s1 = hm.keySet();
        int sum = 0;
        for(int k:s1)
        {
            if(hm.get(k) == 1)
            {
                sum = sum + k;
            }
        }
        return sum;
    }
}