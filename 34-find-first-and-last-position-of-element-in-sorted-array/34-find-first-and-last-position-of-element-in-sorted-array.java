class Solution {
    public int[] searchRange(int[] nums, int t) {
     int s=0,e=nums.length,mid=0;
            int[]res={-1,-1};
            while(s<e){
                    mid=s+(e-s)/2;
                    if(nums[mid]==t){
                            res[0]=mid;
                            res[1]=mid;
                            // System.out.println(mid);
                            leftbs(nums,0,mid,res,t);
                        // System.out.println(res[0]);
                            rightbs(nums,mid+1,nums.length,res,t);
                        // System.out.println(res[1]);
                            return res;
                            
                    }
                    else if(nums[mid]<t)s=mid+1;
                    else e=mid;
            }
      return res;      
    }
    void leftbs(int[]nums,int s,int e,int[] res,int t){
            
        int mid=0;
            while(s<e){
                    mid=s+(e-s)/2;
                    if(mid>0&&nums[mid]==t&&nums[mid-1]<t||
                       mid==0&&nums[mid]==t){
                            res[0]=mid;
                            return;
            }

                    if(nums[mid]==t)
                            e=mid;
                   else if(nums[mid]<t)
                            s=mid+1;
                    
            }
    }
        
    void rightbs(int[]nums,int s,int e,int[]res,int t){
          int mid=0,n=nums.length-1;
                        // System.out.println(s+" "+e);

            while(s<e){
                    mid=s+(e-s)/2;
                        System.out.println(mid);

        if(mid+1<=n&&nums[mid]==t&&nums[mid+1]>t||mid==n&&nums[mid]==t){
                res[1]=mid;
                return;}
                    else if(nums[mid]==t)
                            s=mid+1;
                    else if(nums[mid]>t)
                            e=mid;
            }
    }

}