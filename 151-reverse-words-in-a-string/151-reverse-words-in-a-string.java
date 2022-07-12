class Solution {
    // Approach : to ignore extra space we check if the string till now is empty or not
    // we move from last index of input and when we encounter a space then we just reverse the string we got and store it 
    
    public String reverseWords(String s) {
        int n = s.length();//to store length of the string
        
        String ans="";
        int i=n-1;
        
        while(i>=0){
            StringBuilder temp= new StringBuilder("");
            
            // storing the string
            
            while(i>=0 && s.charAt(i)!=' '){
                temp.append(s.charAt(i));
                i--;
            }
            
                    
            // ignoring spaces
            
            while(i>=0 && s.charAt(i)==' ')i--; 
            
            //if string contains characters then include it
            
            if(temp.length()>0){
                StringBuilder temp2 = new StringBuilder(temp.reverse());
                temp2.append(" ");
                ans+=temp2.toString();
            }
        }
        ans = ans.substring(0,ans.length()-1);
        return ans;
    }
}