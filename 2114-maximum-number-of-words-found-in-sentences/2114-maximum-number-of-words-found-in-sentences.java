class Solution {
    int max=0;
    public int mostWordsFound(String[] s) {
      for(int i=0;i<s.length;i++)
         max=Math.max(max,s[i].split(" ").length); 
        return max;
       
    }
}