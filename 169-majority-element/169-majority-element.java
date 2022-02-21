class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
    int num=nums[0],count=1,max=0,res=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]==num){
            count++;
         if(max<count){
            max=count;
            res=nums[i];}
        }
        else{
            num=nums[i];
            count=1;}

    }
        return res;
    }
}