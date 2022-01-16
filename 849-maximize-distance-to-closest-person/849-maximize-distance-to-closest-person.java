class Solution {
    public int maxDistToClosest(int[] s) {
        int count=0,max=0,n=s.length,flag=0,lc=0,rc=0;
    for(int i=0;i<n;i++){
        if(i==n-1&&s[n-1]==0){
          rc=count;  
        }
        if(s[0]==0&&i!=0&&flag==0&&s[i]==1){
            lc=count;
            flag=1;
            }
            if(s[i]==0){
                ++count;
                if(count>max)
                   max=count; 
            }
            if(s[i]==1)
              count=1;       
    }
        return Math.max(lc,Math.max(max/2,rc));
    }
}