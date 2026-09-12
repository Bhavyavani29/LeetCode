class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        int[] noDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year))
        {
            noDays[1] = 29;
        }
        int t = 0;
        for(int i = 0;i < month-1;i++)
        {
            t = t + noDays[i];
        }
        t = t + day;
        return t;
    }
    static boolean isLeap(int n)
    {
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) return true;
        else
            return false;
    }
}