class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i = 0;i < ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch,0) + 1);
        }
        for(int i = 0;i < magazine.length();i++){
            char ch = magazine.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch,0) + 1);
        }
        for(int i = 0;i < ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(hm2.getOrDefault(ch,0) < hm1.get(ch)){
                return false;
            }
        }
        return true;
    }
}