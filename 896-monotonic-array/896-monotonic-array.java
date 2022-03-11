class Solution {
    public boolean isMonotonic(int[] nums) {
      if(nums.length==1)return true;
        int f=0;
      for(int i=1;i<nums.length;i++){
          if(nums[i-1]<nums[i]&&f==0)f=9;
          else if(nums[i-1]>nums[i]&&f==0)f=1;
          else if(f==9&&nums[i-1]>nums[i])return false;
          else if(f==1&&nums[i-1]<nums[i])return false;
      }
        return true;
    }
}