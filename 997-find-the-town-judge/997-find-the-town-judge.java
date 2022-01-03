class Solution {
    public int findJudge(int n, int[][] t) {
        int res=0,ju=1;
      if(t.length==0)
          return n==1?n:-1;  
      for(int i=0;i<n;i++){
       for(int j=0;j<t.length;j++){
           if(t[j][0]==ju){
               if(ju==n){
                  return -1; 
               }
               ju++;
               break;
           }
           if(j==t.length-1){
               res=check(ju,t,n);
           }
           
       }
      }
        return res;
    }
    public int check(int ju,int[][]t,int n){
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<t.length;i++){
            if(t[i][1]==ju)
            h.put(t[i][0],t[i][1]);
        }
        if(h.size()==n-1)
            return ju;
        return -1;
    }
}