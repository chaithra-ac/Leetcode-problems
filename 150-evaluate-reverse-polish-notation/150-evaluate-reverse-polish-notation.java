class Solution {
    int a,b;
    public int evalRPN(String[] tokens) {
     Stack<Integer>stack=new Stack<>();
      int i=0;
        while(i<tokens.length){
                            // System.out.println(stack);
        if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
            
                b=stack.pop();
                a=stack.pop();
                            
                switch(tokens[i++]){
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(a-b);break;
                    case "/":stack.push(a/b);break;
                    case "*":stack.push(a*b);break;
                }
            }   
            
            else
                stack.push(Integer.parseInt(tokens[i++]));   
        }
       return stack.peek();
    }
}