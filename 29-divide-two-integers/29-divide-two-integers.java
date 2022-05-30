class Solution {
    public int divide(int dividend, int divisor) {
        System.out.println(Integer.MAX_VALUE+"..."+((dividend/divisor)));
    if(divisor==-1&& dividend==Integer.MIN_VALUE){
    return Integer.MAX_VALUE;

    }
        if(Math.pow(-2,31) <= dividend&& divisor <= (Math.pow(2,31 )-1) && divisor!=0){
                  int res= dividend/divisor;
            if(res>Integer.MAX_VALUE)
                   return Integer.MAX_VALUE;
            else return res;
        }
        return 0;
    }
}