class Solution {
    public int bitwiseComplement(int num) {
       String  r="";
        if(num==0)return 1;
        while(num>0){
          int res=((num&1)==1?0:1);
           r=""+res+r;
        num= num>>1;
       }
        return Integer.parseInt(r,2);
    }
}