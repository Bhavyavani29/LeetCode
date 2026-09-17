class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        boolean hasOdd = false;
        int length = 0;
        for(int num : hm.values()){
            if(num % 2 == 0){
                length += num;
            }
            else{
                length += num - 1;
                hasOdd = true;
            }
            
        }
        if(hasOdd){
            length += 1;
        }
        return length;
    }
}