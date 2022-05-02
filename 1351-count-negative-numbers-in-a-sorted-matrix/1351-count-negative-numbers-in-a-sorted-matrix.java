class Solution {
    public int countNegatives(int[][] nums) {
        int s=0,e=0,mid=0,i=0,j=0,r=0;
     for(i=0;i<nums.length;i++){
        for(j=0;j<nums[0].length;j++){
            e=nums[0].length;
            s=0;
                while(s<e){
                    mid=s+(e-s)/2;
                    // System.out.print(mid+" ");
                    if(nums[i][mid]>=0)s=mid+1;
                    else
                        e=mid;   
                }
        }
         r+=nums[0].length-s;
        // System.out.println(s+" "+e+" "+r);
         
     } 
        return r;
    }
}