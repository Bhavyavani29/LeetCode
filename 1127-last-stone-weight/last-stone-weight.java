class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if (n == 1) {
            return stones[0];
        }
        for(int i = 0; i < n;i++){
            Arrays.sort(stones);
            int stone1 = stones[n - 1];
            int stone2 = stones[n - 2];
            if(stone2 == 0){
                break;
            }
            if(stone1 == stone2){
                stones[n - 1] = 0;
                stones[n - 2] = 0;
            }
            else{
                stones[n - 1] = stone1 - stone2;
                stones[n - 2] = 0;
            }
        }
        Arrays.sort(stones);
        return stones[n - 1];
    }
}