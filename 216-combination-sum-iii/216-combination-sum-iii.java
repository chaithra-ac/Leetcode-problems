class Solution {
    List<List<Integer>>l=new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        compute(k,n,1,new ArrayList());
        return l;
    }
    public void compute(int k,int n,int ele,List<Integer>cur){
        if(cur.size()==k&&n==0){
            l.add(new ArrayList(cur));
            return;
        }

        if(ele>9){
            return;
        }
                if(cur.size()<=k){
            cur.add(ele);
             System.out.println(cur+" "+n);

        compute(k,n-ele,ele+1,cur);
        cur.remove(cur.size()-1);
        compute(k,n,ele+1,cur);
        }
    }
}