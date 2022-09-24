class Solution {
    public int concatenatedBinary(int n) {
        int max=1000000007;
        int res=0,bit=0;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;++i)
            sb.append(Integer.toBinaryString(i));
        int l=sb.toString().length();
        
         for(int i=2,j=l-2;j>=0;i=(i*2)%max,j--){
              bit=sb.charAt(j)=='1'?1:0;
            if(res+i*bit>=max){
                res=(res+i*bit)%max;
            }
             
             else res+=i*bit;
         }               
         bit=sb.charAt(l-1)=='1'?1:0;
         if(res+bit>=max)
            res=(res+bit)%max;
        else res+=bit;
        return res;
    }
}