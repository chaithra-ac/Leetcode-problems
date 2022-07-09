class Solution {
    public int maxProduct(int[] nums) {
        int p = 1;
        int max = Integer.MIN_VALUE;
        
        for (int i=0;i<nums.length;++i) {
            p = p* nums[i];
            max = Math.max(p, max);
            p=p==0?1:p;     
        }
        p = 1; 
        for (int i=nums.length-1;i>=0;--i) {
            p = p * nums[i];
            max = Math.max(p, max);
            p=p==0?1:p;     
        }
        return max;
    }
} 
