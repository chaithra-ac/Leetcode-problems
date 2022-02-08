class Solution {
    public int maxArea(int[] h) {
     int i=0,j=h.length-1,res=0;
        while(i<j){
           int c=Math.min(h[i],h[j])*(j-i);
            res=Math.max(res,c);
            if(h[i]<h[j])
                i++;
            else j--;
        }
        return res;
    }
}