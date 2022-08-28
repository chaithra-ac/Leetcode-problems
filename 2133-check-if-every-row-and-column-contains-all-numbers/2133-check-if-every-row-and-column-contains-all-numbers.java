class Solution {
    public boolean checkValid(int[][] m) {
        int n=m.length;
      for(int i=0;i<n;i++){
          HashSet<Integer>r=new HashSet<>();
          HashSet<Integer>c=new HashSet<>();
          for(int j=0;j<n;j++){
              if(!r.add(m[i][j])||!c.add(m[j][i]))return false;
          }
      }
        return true;
    }
}