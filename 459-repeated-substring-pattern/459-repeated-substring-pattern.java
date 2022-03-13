class Solution {
   /* public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1)return false;
        // if(s.equals("abaababaab"))return true;
        String temp=""+s.charAt(0),sofar=""+s.charAt(0);
         int i=1;
        while(i<s.length()){
            sofar+=s.charAt(i);
            System.out.println(s.substring(i,i+temp.length())+" "+sofar);
          if(i+temp.length()<=s.length()&&
             temp.equals(s.substring(i,i+temp.length()))){
              sofar+=s.substring(i+1,i+temp.length());
              i+=temp.length();
          }
            else{
                temp=sofar;
                if(s.substring(i+1).length()<=temp.length())return false;
                i++;
            }
              
      }
     return true;   
    }*/
        
            public boolean repeatedSubstringPattern(String str) {
        String s = str + str;
                System.out.print(s.substring(1,s.length()-1));
        return s.substring(1, s.length() - 1).contains(str);
    }

}