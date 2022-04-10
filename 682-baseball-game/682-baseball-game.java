class Solution {
    public int calPoints(String[] ops) {
        int sum=0,t=0;
       ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<ops.length;i++){
                          // System.out.println(list);  
            if(ops[i].equals("D")){
               list.add(list.get(list.size()-1)*2);
            }
            else if(ops[i].equals("C")){
                list.remove(list.size()-1);
            }
            else if(ops[i].equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else{
                // System.out.println();
                t=Integer.parseInt(ops[i]);
                 list.add(t);
            }
        }
        for(int i:list){
            sum+=i;
        }
        return sum;
    }
}