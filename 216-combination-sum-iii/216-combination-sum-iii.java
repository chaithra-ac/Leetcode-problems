class Solution {
    List<List<Integer>>l=new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        compute(k,n,1,new ArrayList());
        return l;
    }
    public void compute(int k,int remain,int num,List<Integer>cur){
        if(cur.size()==k&&remain==0){
            l.add(new ArrayList(cur));
            return;
        }
        else if(num>9||remain<0){
            return;
        }
        if(cur.size()<=k){
        cur.add(num);
        compute(k,remain-num,num+1,cur);
        cur.remove(cur.size()-1);
        compute(k,remain,num+1,cur);
        }
    }
}