class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isNotPrime = new boolean[n];
        int count = n - 2;
        for (int p = 2; p * p < n; p++) {
            if (!isNotPrime[p]) {
                for (long i = (long) p * p; i < n; i += p) {
                    if (!isNotPrime[(int) i]) {
                        isNotPrime[(int) i] = true;
                        count--; 
                    }
                }
            }
        }
        return count;
    }
}