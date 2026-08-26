class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; 
        if (n == 2) return 2;
        int F[] = new int[n+1];
		F[1] = 1; F[2] = 2;
		for(int i = 3;i <= n;i++){
			F[i] = F[i-1]+F[i-2];
		}
		return F[n];
        /*if(n == 1) return 1;
		else if(n == 2) return 2;
		else
			return climbStairs(n-1)+climbStairs(n-2);*/
    }
}