class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n==0)return true;
        if(nums.length==1)
            return (n==1&&nums[0]==0)?true:false; 
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0&&n>0){
              
         if(i==0&&nums[i+1]==0||
            i==nums.length-1&&nums[nums.length-2]==0||
            i>0&&nums[i- 1]==0&&nums[i+1]==0){
             nums[i]=1;
             n--;}
        }
     }
        return n==0;
    }
}