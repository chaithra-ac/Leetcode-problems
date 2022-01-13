class Solution {
    int res=0;
    public int eraseOverlapIntervals(int[][] time) {
     Arrays.sort(time,(int []a,int[]b)->Integer.compare(a[1],b[1]));
        
        int end=time[0][1];
        for(int i[]:time){
            System.out.println(i[0]+","+i[1]);
            
            if(end-i[0]<=0){
                end=i[1];
                continue;
            }
            else{
                System.out.println(i[1]);
                res++;
            }
            
        }
        return res-1;
    }
}