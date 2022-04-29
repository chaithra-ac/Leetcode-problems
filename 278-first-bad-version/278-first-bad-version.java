/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
     int s=1,mid=0,e=n,res=1;
        boolean b=false;
        while(s<e){
            mid=s+(e-s)/2;
            b=isBadVersion(mid);
            if(b)res=mid;
            if(b)
                e=mid;
            else
                s=mid+1;
        }
    return s;
    }
}