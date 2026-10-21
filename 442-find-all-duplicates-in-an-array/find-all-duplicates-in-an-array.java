class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer> s1=hm.keySet();
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:s1)
        {
            if(hm.get(x)==2)
            {
                al.add(x);
            }
        }
        return al;
    }
}