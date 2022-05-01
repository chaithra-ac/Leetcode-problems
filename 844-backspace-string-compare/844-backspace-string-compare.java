class Solution {
     Stack<Character>stack=new Stack<>();
    public boolean backspaceCompare(String s, String t) {
        back(s);
        s=become();
        back(t);
        t=become();
        System.out.print(s+" "+t);
        
       return s.equals(t); 
        
    }
     void back(String s){
              for(int i=0;i<s.length();i++){
        
            if(!stack.isEmpty()&&s.charAt(i)=='#')
                stack.pop();
            else if(s.charAt(i)!='#')
                stack.push(s.charAt(i));
        }
  
    }
    String become(){
        String s="";
      while(!stack.isEmpty()){
         s=stack.pop()+s; 
      }
        return s;
    }
}