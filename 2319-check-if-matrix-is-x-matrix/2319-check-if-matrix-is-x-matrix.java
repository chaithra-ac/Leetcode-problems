class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        
        // Check Diagnonals
        for(int i =0; i < n ; i++){
            if(grid[i][i] == 0 || grid[i][Math.abs(n-i-1)] == 0){
                return false;
            }
            
        }
       
        
        // check rest of the block
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n ; j++){
                if(j == i || j == Math.abs(n-i-1)){
                    continue;
                }else if(grid[i][j] != 0){
                    return false;
                }
            }
        }
        
        return true;
    }
}
