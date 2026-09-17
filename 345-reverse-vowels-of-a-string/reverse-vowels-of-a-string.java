class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            while (i < j && vowels.indexOf(ch[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(ch[j]) == -1) {
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}