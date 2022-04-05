class Solution {
    public int maxArea(int[] h) {
       int i=0,j=h.length-1,max=0,ans=0;
        
        while(i<j){
           max=Math.min(h[i],h[j])*(j-i); 
            if(ans<max)
                ans=max;
            if(h[i]<h[j])i++;
            else j--;
        }
        return ans;
    }
}

