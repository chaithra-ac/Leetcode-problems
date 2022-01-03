class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int c[] = new int[n+1];
        
        for(int t[] : trust){
            c[t[0]]--;
            c[t[1]]++;  
        }
        
        for(int i=1;i<=n;i++){
            if(c[i]==n-1) return i;
        }
        
        return -1;
        
    }
}
