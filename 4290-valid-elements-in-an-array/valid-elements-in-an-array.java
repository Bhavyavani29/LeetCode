import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        if (n <= 2) {
            for (int num : nums) {
                result.add(num);
            }
            return result;
        }
        int[] maxRight = new int[n];
        int currentMaxRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = currentMaxRight;
            currentMaxRight = Math.max(currentMaxRight, nums[i]);
        }
        result.add(nums[0]);
        int maxLeft = nums[0];
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > maxLeft || nums[i] > maxRight[i]) {
                result.add(nums[i]);
            }
            maxLeft = Math.max(maxLeft, nums[i]);
        }
        result.add(nums[n - 1]);
        return result;
    }
}