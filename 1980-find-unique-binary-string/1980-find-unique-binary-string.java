class Solution {
    public String findDifferentBinaryString(String[] nums) {
       Set<String>set=new HashSet<>();
        for(String s:nums)set.add(s);
        int len=nums.length;
        int n=(int)Math.pow(2,len);
        
        for(int i=0;i<=n;i++){
           String cur=Integer.toBinaryString(i);
           String rem=Integer.toBinaryString(1<<(len-cur.length()));
            String form=cur+rem.substring(1);
            if(!set.contains(form))return 
                form;
        }
        return "";
    }
}