class Solution {
    public String countAndSay(int n) {
       if (n <= 0)
            return "";
        String res = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int len = res.length();
            for (int j = 0; j < len; j++) {
                int count = 1;
                while (j + 1 < len && res.charAt(j) == res.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(res.charAt(j));
            }
            res = sb.toString();
        }
        return res;
    }
}