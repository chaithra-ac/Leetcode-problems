class Solution {
    public int concatenatedBinary(int n) {
        long max = (int)1e9+7,res = 0;
        for (int i = 1; i <= n; i++)
            res = (res * (int)Math.pow(2, Integer.toBinaryString(i).length()) + i) % max;

        return (int)res;
    }
}