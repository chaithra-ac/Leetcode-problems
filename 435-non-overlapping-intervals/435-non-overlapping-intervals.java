class Solution {
    int res=1;
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->{
        return a[1]>b[1]?1:-1;   
       });
        int arrow=points[0][1];
        for(int i[]:points){
            if(i[0]<=arrow){
                continue;
            }
            else{
                arrow=i[1];
                res++;
            }
        }
        return res;
    }
}