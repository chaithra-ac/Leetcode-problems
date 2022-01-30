class Solution {
    public int[] searchRange(int[] nums, int target) {
        int j=0;
       int []a={-1,-1};
        int start=0;
        int end=nums.length;
        if(nums.length==0){
            return a;
        }
        int mid=0;
      while(start<end){
          if(start==end&&nums[start]!=target){
              return new int []{-1,-1};
          }
        mid=start+(end-start)/2;
          if(nums[mid]==target){
               j=mid;
              while(j>=0&&nums[j]==target){
                  a[0]=j;
                  j--;
              }
              j=mid;
              while(j<nums.length&&nums[j]==target){
                  a[1]=j;
                  j++;
              }
              return a;
          }    
            if(nums[mid]>target)
                 end=mid;
             
             else if(nums[mid]<target)
                  start=mid+1;
              
       }
      return a;  
    }
}