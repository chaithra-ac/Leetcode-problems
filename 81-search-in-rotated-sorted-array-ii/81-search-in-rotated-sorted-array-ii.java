class Solution {
    public boolean search(int[] nums, int target) {
       int i=-1,j=nums.length;
        if(nums.length==1)
           return nums[0]==target?true:false;
               
      while((++i)<=nums.length/2&&(--j)>=nums.length/2){
          if(nums[i]==target||nums[j]==target){
              return true;
          }
          /*else{
              i++;
              j--;
          }*/
      }
        return false;
    }
}