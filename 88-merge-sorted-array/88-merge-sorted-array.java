class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      if(n==0)return;
      if(m==0){
        for(int i=0;i<n;i++)
            nums1[i]=nums2[i];
          return;
      }
       n=n-1;
        m=m-1;
        int t=0;
       while(n>=0){
        if(nums1[m]<=nums2[n]){
            nums1[++m]=nums2[n--];
        }
          else if(nums1[m]>nums2[n]){
              int i=m;
              // System.out.print(" "+nums1[i]);
              while(i>=0){
                  
                  if(nums1[i]<=nums2[n]){
                      nums1[i+1]=nums2[n--];
                      m+=1;
                      break;
                      }
                  nums1[i+1]=nums1[i];
                  nums1[i]=0;
                  if(i==0){
                      nums1[i]=nums2[n--];
                      m+=1;
                  }
               // System.out.println(Arrays.toString(nums1)+" "+m);
                   i--;
              }
              
          }
    }
        return;
    }
}