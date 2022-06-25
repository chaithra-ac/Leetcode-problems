class Solution {
    public int fib(int n) {
      int sum=0,f=0,s=1;
        if(n<=1)return n;
        for(int i=2;i<=n;i++){
            sum=f+s;
              f=s;
              s=sum;
            // System.out.println(f+" "+s+" "+sum);   
        }
      return s;  
    }
}