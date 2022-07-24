class Solution {
    public int equalPairs(int[][] grid) {
     List<ArrayList<Integer>>row=new ArrayList<>(); 
        for(int i=0;i<grid.length;i++)row.add(new ArrayList<Integer>());
        int k=0,res=0;
             for(int i=0;i<grid.length;i++){
               for(int j=0;j<grid[0].length;j++){
                   row.get(i).add(grid[i][j]);
     }
             }
        for(int i=0;i<grid.length;i++){
         ArrayList<Integer>col=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
               col.add(grid[j][i]); 
            }
            for(ArrayList<Integer>c:row)
            if(c.equals(col))res++;
        }
        return res;
    }
}