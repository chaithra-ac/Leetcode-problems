class Solution {
    public int fillCups(int[] nums) {
        int c=0;
         Arrays.sort(nums);
     while(nums[2]!=0){
         if(nums[1]!=0){
            --nums[1];--nums[2];
             ++c;
         }
         else
            return c+=nums[2];
            Arrays.sort(nums);
         
     }
        return c;
    }
}