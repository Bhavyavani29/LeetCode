class Solution {
    public boolean isPalindrome(int x) {
        int num=x,r=0;
        while(x>0){
            int N=x%10;
            r=r*10+N;
            x=x/10;
        }
        if(num==r)
            return true;
        else
           return false;
    }
}