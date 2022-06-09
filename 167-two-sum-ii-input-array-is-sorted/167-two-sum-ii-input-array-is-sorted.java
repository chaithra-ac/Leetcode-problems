class Solution {
    int index=-1;
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length-1;i++){
          index=bs(i+1,nums.length,nums,target-nums[i]);
           if(index!=-1)return new int[]{i+1,index+1};
       } 
        return new int[]{};
    }
    int bs(int s,int e,int[] nums,int t){
        int mid=0;
        while(s<e){
           mid=s+(e-s)/2;
            if(nums[mid]==t)return mid;
            else if(nums[mid]<t)
                s=mid+1;
                else
                    e=mid;
                    
        }
        return -1;
    }
}