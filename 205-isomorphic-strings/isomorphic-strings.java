class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hm1.containsKey(ch1)){
                hm1.put(ch1, ch2);
            }
            else{
                if(hm1.get(ch1) != ch2)
                    return false;
            }
            if(!hm2.containsKey(ch2)){
                hm2.put(ch2, ch1);
            }
            else{
                if(hm2.get(ch2) != ch1)
                    return false;
            }
        }
        return true;
    }
}