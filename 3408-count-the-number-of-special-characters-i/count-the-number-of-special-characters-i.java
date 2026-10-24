class Solution {
    public int numberOfSpecialChars(String word) {
        int specialCount = 0;
        boolean hasLower[] = new boolean[26];
        boolean hasUpper[] = new boolean[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch))
                hasLower[ch - 'a'] = true;
            else if (Character.isUpperCase(ch)) {
                hasUpper[ch - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (hasLower[i] && hasUpper[i]) {
                specialCount++;
            }
        }
        return specialCount;
    }
}