class Solution {
    public int peakIndexInMountainArray(int[] nums) {
       int s=0,mid=0,e=nums.length;
        while(s<e){
             mid=s+(e-s)/2;
             if(nums[mid]<nums[mid+1])
                s=mid+1;
              else
                 e=mid;
                
        }
        return s;
    }
}