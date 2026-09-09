class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1, high = 0, result = 0;
        for(int num : weights){
            high += num;
            low = Math.max(low, num);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(shipCapacity(weights, days, mid)){
                result = mid;
                high = mid - 1;
                
            }
            else
                low = mid + 1;
        }
        return result;
    }
    public static boolean shipCapacity(int[] weights, int days, int currMidValue){
        int maxDays = 1, currSum = 0;
        for(int nums : weights){
            //currSum += nums;
            if(currSum + nums > currMidValue){
                maxDays++;
                currSum = 0;
            }
            currSum += nums; 
        }
        return maxDays <= days;
    }
}