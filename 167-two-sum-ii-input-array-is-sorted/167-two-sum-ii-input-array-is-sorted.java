class Solution {
    int index,mid,s,e,t;
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length-1;i++){
          mid=0;index=-1;s=i+1;e=nums.length;t=target-nums[i];
        while(s<e){
           mid=s+(e-s)/2;
            if(nums[mid]==t){
                index= mid;
                break;}
            else if(nums[mid]<t)
                s=mid+1;
                else
                    e=mid;
                    
        }
          if(index!=-1)return new int[]{i+1,index+1};
       } 
        return new int[]{};
    }

}