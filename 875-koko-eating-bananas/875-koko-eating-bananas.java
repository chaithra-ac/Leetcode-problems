class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        double s=0;
        int res=0,max=0;
     // for(int i:piles)
         // s+=i;
        
        int start=0,mid=0;
        // if(s>Integer.MAX_VALUE)
            int end=1000000000;
           res=end;
        while(start<end){
            mid=start+(end-start)/2; 
            if(res<mid){
                return res;
            }
            if(canComplete(piles,mid,h)&&mid<=res){
               end=mid;
                res=mid;
            }
            else if(!canComplete(piles,mid,h))
                start=mid+1;;
        }
    return res;
    }
    boolean canComplete(int[]piles,int mid,int h)
    {
        int hr=0;
        for(int i:piles)
            hr+=(int)Math.ceil((double)i/mid);
        return hr<=h;
    }
}