class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        int n = candyType.length;
        for(int num : candyType){
            hs.add(num);
        }
        return Math.min(hs.size(), n / 2);
    }
}