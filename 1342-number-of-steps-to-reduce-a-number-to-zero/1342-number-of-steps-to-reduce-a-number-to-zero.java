class Solution {
    public int numberOfSteps(int num) {
        int res=0;
        while(num>0){
            res++;
            System.out.println(num+" ");
            if(num%2==0)num/=2;
            else num-=1;
        }
       return res++;
    }
}