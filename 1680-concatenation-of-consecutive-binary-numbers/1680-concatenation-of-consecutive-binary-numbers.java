class Solution {
    public int concatenatedBinary(int n) {
        long max = (int)1e9+7,res = 0,s=0;
        for(int i = 1; i <= n; i++) {
            if((i & (i - 1)) == 0)
                s++;
            res = ((res << s) | i) % max;
        }
        return (int)res;
    }
}