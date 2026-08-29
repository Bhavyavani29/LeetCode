class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        if(n<=4)
           return c;
        for(int i=5;n/i>=1;i=i*5){
            c=c+n/i;
        }
        return c;
    }
}