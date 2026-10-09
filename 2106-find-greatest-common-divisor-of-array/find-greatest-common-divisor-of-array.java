class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0], max=nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i]<min)
                min=nums[i];
            if (nums[i]>max)
                max=nums[i];
        }
        return gcd(min, max);
    }
    public static int gcd(int m, int n) {
        while (n%m!=0) {
            int r=n%m;
            n=m;
            m=r;
        }
        return m;
    }
}
