class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num , hm.getOrDefault(num , 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) ->{
            int fA = hm.get(a);
            int fB = hm.get(b);
            if(fA != fB){
                return fA - fB;
            }
            else{
                return b - a;
            }
        });
        for(int num : nums)
            pq.offer(num);
        int [] res = new int[nums.length];
        int  i = 0;
        while(!pq.isEmpty())
            res[i++] = pq.poll();
        return res;
    }
}