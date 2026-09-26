class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }
        String cleaned = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");
        String[] words = cleaned.split("\\s+");
        Map<String, Integer> countMap = new HashMap<>();
        String resultWord = "";
        int maxCount = 0;
        for (String word : words) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                int count = countMap.getOrDefault(word, 0) + 1;
                countMap.put(word, count);     
                if (count > maxCount) {
                    maxCount = count;
                    resultWord = word;
                }
            }
        }
        return resultWord;
    }
}
