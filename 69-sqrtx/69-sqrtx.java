class Solution {
    public int mySqrt(int x) {
         long start=0;
         long end=x,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid>x){
                end=mid-1;
            }
            else if(mid*mid<x){
                start=mid+1;
            }
            else
                return (int)mid;
        }
        return (int)end;
    }
}