class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>l=new ArrayList<>();
        int n=0;
      if(nums1.length<nums2.length){
       for(int i=0;i<nums1.length;i++){
          Arrays.sort(nums2);
          n=bs(nums2,nums1[i]);
           if(n!=-1)l.add(n);
       }
          
      }
         else{
       for(int i=0;i<nums2.length;i++){
          Arrays.sort(nums1);
          n=bs(nums1,nums2[i]);
           if(n!=-1)l.add(n);
       }
    }
        int[]res=new int[l.size()];
          System.out.print(l);

        for(int i=0;i<l.size();i++)
          res[i]=l.get(i);  
        
        return res;
    }
    int bs(int[] nums,int t){
        int s=0,e=nums.length,mid=0,temp=0;
        while(s<e){
            mid=s+(e-s)/2;
            if(nums[mid]==t){
                // System.out.println(mid+" "+nums[mid]);
                temp=nums[mid];
                 nums[mid]=-1;
                return temp;
            }
            else if(nums[mid]<t)s=mid+1;
            else e=mid;
        }
        return -1;
    }
}