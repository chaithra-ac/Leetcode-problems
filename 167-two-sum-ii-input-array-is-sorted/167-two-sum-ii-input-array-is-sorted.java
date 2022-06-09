class Solution {
    public int[] twoSum(int[] nums, int t) {
        int i=0,j=nums.length-1;
        while(i!=j){
            int sum=nums[i]+nums[j];
            if(sum==t)return new int[]{i+1,j+1};
            if(sum>t)
                j--;
            else i++;
        }
        return new int[]{};
    }
}