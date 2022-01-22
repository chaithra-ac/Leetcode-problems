class Solution {
        List<List<Integer>>p=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
    ArrayList<Integer>l=new ArrayList<>();

    for(int i=0;i<nums.length;i++)
       l.add(nums[i]); 
        permute(l,0,nums.length);
        return p;

    }
        
      void permute( ArrayList<Integer>l,int s,int le){
        if(!p.contains(l)){
            p.add(new ArrayList(l));
            // return;
        }
        int ele=s;
        for(int i=s;i<le;i++){
          swap(i,ele,l);
            // System.out.println(l);
            permute(l,s+1,le);
            swap(i,ele,l);
        }
            
    }
    void swap(int a,int b,ArrayList<Integer>l){
        int temp1=l.get(a);
        int temp2=l.get(b);
        l.set(a,temp2);
        l.set(b,temp1);
    }
}