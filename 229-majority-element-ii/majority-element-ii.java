class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            if (!h.containsKey(num))
                h.put(num, 1);
            else
                h.put(num, h.get(num) + 1);
        }
        Set<Integer> s1 = h.keySet();
        for (int x : s1) {
            if (h.get(x) > n / 3) {
                al.add(x);
            }
        }
        return al;
    }
}