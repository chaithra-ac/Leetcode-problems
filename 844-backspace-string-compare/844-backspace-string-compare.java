class Solution {
    public boolean backspaceCompare(String s, String t) {
       return back(s).equals(back(t)); 
        
    }
     String back(String s){
     Stack<Character>stack=new Stack<>();
              for(int i=0;i<s.length();i++){
        
            if(!stack.isEmpty()&&s.charAt(i)=='#')
                stack.pop();
            else if(s.charAt(i)!='#')
                stack.push(s.charAt(i));
        }
         return String.valueOf(stack);
  
    }
}