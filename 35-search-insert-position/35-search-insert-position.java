class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,m=0,e=nums.length;
        while(s<e){
           m=s+(e-s)/2;
            System.out.print(m+" ");
            if(nums[m]==target)return m;
            else if(nums[m]<target)s=m+1; 
            else e=m;
                    
        }
        return s;
        
    }
}
/*
class Solution {
    public int searchInsert(int[] nums, int target) {
      int s=0,e=nums.length,mid=0;
        while(s<e){
            mid=s+(e-s)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)s=mid+1;
            else e=mid;
        }
        return s;
        
    }
}
*/