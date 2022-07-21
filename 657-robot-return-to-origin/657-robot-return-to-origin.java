class Solution {
    public boolean judgeCircle(String moves) {
         int i=0,j=0;       
        for(int k=0;k<moves.length();k++){
          if(moves.charAt(k)=='U')i-=1;
          else if(moves.charAt(k)=='D')i+=1;
          else if(moves.charAt(k)=='L') j-=1;
          else j+=1;
              
        }
        return i==0&&j==0;

    }
}