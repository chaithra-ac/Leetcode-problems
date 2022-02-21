class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> generate(int num) {
        if(num>0)
            list.add(new ArrayList());
            list.get(0).add(1);
        for(int i=1;i<num;i++){
            list.add(new ArrayList());
            list.get(i).add(1);
            for(int j=0;j<i-1;j++){
                int temp=list.get(i-1).get(j)+
                    list.get(i-1).get(j+1);
                list.get(i).add(temp);
            }
            list.get(i).add(1);
                        // System.out.println(list);

            
        }
        
        
        return list;
     }
}