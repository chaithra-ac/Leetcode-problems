class Solution {
    public int minMoves(int[] nums) {
        int moves=0,min=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i<n;i++)
            if(min>nums[i])min=nums[i];
            for(int i=0;i<n;i++)
               moves+=nums[i]-min;
                return moves;
    }
}