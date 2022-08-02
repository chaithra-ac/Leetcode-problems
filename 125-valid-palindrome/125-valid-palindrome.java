class Solution {
    public boolean isPalindrome(String s) {
      String format=s.toLowerCase(),st="";
      for(int i=format.length()-1;i>=0;i--)
          if((format.charAt(i)>='a'&&format.charAt(i)<='z')
             ||(format.charAt(i)>='0'&&format.charAt(i)<='9'))
              st+=format.charAt(i);
        // System.out.print(format+" "+st);
        StringBuilder sb=new StringBuilder(st);
        return st.equals(sb.reverse().toString());
              
    }
}