class Solution {
    public int lengthOfLongestSubstring(String s) {
       int a=0,count=0,i=0;
      HashSet<Character>hs=new HashSet<Character>();
  while(i<s.length()){
        if(!hs.contains(s.charAt(i))){
          hs.add(s.charAt(i));
            i++;
        count=Math.max(hs.size(),count);
      }
        else {
                        hs.remove(s.charAt(a));
            a++;
             }
      }
        return count;
    }
}