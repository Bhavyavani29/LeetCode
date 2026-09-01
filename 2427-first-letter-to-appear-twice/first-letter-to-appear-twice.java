class Solution {
    public char repeatedCharacter(String s) {
        char[] c = s.toCharArray();
        HashMap<Character,Integer> h =new HashMap<>();
        for(char ch : c){
            h.put(ch , h.getOrDefault(ch,0) + 1);
            if(h.get(ch) > 1){
                return ch;
            }
        }
        return '\0';
    }
}