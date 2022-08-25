class Solution {
    public String findDifferentBinaryString(String[] nums) {
       Set<String>set=new HashSet<>();
        for(String s:nums)set.add(s);
        int len=nums.length;
        String cur="",unique="";
        int n=(int)Math.pow(2,len);
        
        for(int i=0;i<=n;i++){
           cur=Integer.toBinaryString(i);
           unique=cur+(Integer.toBinaryString(1<<(len-cur.length()))).substring(1);
            if(!set.contains(unique))return 
                unique;
        }
        return "";
    }
}