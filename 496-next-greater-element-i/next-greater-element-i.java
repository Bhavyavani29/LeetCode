class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        st.push(nums2[n - 1]);
        map.put(nums2[n - 1], -1);
        
        for(int i = n - 2; i >= 0; i--){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek() <= curr) st.pop();
            if(st.isEmpty()) map.put(curr, -1);
            else map.put(curr, st.peek());
            st.push(curr);
        }
        
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        
        return res;
    }
}