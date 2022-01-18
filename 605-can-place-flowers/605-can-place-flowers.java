class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n==0)return true;
     for(int i=0;i<nums.length;i++){
         System.out.print(i);
         if(nums[i]==0&&n>0){
         if(nums.length==1)
            return (n==1&&nums[i]==0)?true:false; 
         
         if(i==0&&nums[i+1]==0){
             nums[i]=1;
             n--;continue;
         }
         
         else if(i==nums.length-1&&nums[nums.length-2]==0){
             nums[i]=1;
             n--;continue;
         }
         
         else if(i>0&&nums[i-1]==0&&nums[i+1]==0){
             nums[i]=1;
             n--;
         }
         }  
     }
        return n==0;
    }
}