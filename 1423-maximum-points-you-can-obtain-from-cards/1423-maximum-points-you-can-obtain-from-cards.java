class Solution {
    public int maxScore(int[] points, int k) {
        int n=points.length;
       int l=points[0]; 
        for(int i=1;i<k;i++){
            l+=points[i];
        }
        int i=n-1,j=k-1,max=l;
        while(j>=0&&i>=0){
            l=l-points[j--]+points[i--];
            max=Math.max(l,max);
        }
        return max;
    }
}