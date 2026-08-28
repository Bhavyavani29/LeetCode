class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> evenIndices = new ArrayList<>();
        ArrayList<Integer> oddIndices = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            if (i % 2 == 0) {
                evenIndices.add(nums[i]);
            } else {
                oddIndices.add(nums[i]);
            }
        }
        Collections.sort(evenIndices);
        Collections.sort(oddIndices, Collections.reverseOrder());
        int evenPointer = 0;
        int oddPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = evenIndices.get(evenPointer++);
            } else {
                nums[i] = oddIndices.get(oddPointer++);
            }
        }
        return nums;
    }
}
