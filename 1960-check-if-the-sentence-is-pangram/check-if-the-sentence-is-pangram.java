class Solution {
    public boolean checkIfPangram(String sentence) {
        /*sentence = sentence.toLowerCase();
		int[] freq = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true; */

        HashSet<Character> hs = new HashSet<>();
        if(sentence.length() < 26)
            return false;
        for(char ch : sentence.toCharArray()){
            hs.add(ch);
        }
        if(hs.size() == 26){
            return true;
        }
        return false;
    } 
}