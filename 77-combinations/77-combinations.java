class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        compute(list,n,k,1,new ArrayList());
        return list;
    }
    void compute(List<List<Integer>>list,int n,int k,int i,ArrayList<Integer>l){
        if(k==l.size()){
            list.add(new ArrayList(l));
            return;
        }
        if(l.size()>k||i>n)
            return;
        l.add(i);
        compute(list,n,k,i+1,l);
        l.remove(l.size()-1);
        compute(list,n,k,i+1,l);
    }
}