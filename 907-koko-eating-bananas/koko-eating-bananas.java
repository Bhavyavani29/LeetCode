class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0, result = 0;
        for (int num : piles) {
            high = Math.max(num, high);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean canEat(int[] piles, int h, int currMidValue) {
        long totalHours = 0;
        for(int num : piles){
            int hoursForPile = num / currMidValue;
            if (num % currMidValue != 0) {
                hoursForPile++;
            }
            totalHours += hoursForPile;
        }
        return totalHours <= h;
    }
}