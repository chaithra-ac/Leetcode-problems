class Solution {
    public boolean hasAllCodes(String s, int k) {
       Set<String>set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
           set.add(s.substring(i,i+k)); 
        }
        // System.out
        return Math.pow(2,k)==set.size();
    }
}