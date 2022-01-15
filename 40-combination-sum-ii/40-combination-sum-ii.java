class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
      Set<List<Integer>>l=new HashSet();
        compute(l,new ArrayList(),candidates,target,0);
        return new ArrayList(l);
    }
    void compute(Set<List<Integer>>l,List<Integer>cur,int[]a,int t,int n){
        if(t<0){
            return;
        }
        if(t==0){
            l.add(new ArrayList(cur));
            // return;
        }
        for(int i=n;i<a.length;i++){
            if(i>n&&a[i]==a[i-1])continue;
        if(a[i]<=t){
        cur.add(a[i]);
        compute(l,cur,a,t-a[i],i+1);
        cur.remove(cur.size()-1);
        }
        }
    }
}