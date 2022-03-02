class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=s.length();
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j<l&&t.charAt(i)==s.charAt(j)){
                j++;
                }
            }
        if(l==j)return true;
        return false;
        
    }
}