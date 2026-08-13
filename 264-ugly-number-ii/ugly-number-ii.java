class Solution {
    public int nthUglyNumber(int n) {
        int result[] = new int[n];
        result[0] = 1;
        int fact2 = 0, fact3 = 0, fact5 = 0;
        if(n <= 0) return 0;
        for(int i = 1; i < n; i++){
            int next2 = result[fact2] * 2;
            int next3 = result[fact3] * 3;
            int next5 = result[fact5] * 5;
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            result[i] = nextUgly;
            if(nextUgly == next2) fact2++;
            if(nextUgly == next3) fact3++;
            if(nextUgly == next5) fact5++;
        } 
        return result[n - 1];
    }
}