class Solution {
    public int fillCups(int[] nums) {
        int c=0,t1=0,t2=0;
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
         for(int i:nums)
             q.add(i);
        while(q.peek()!=0){
            t1=q.remove();
            t2=q.remove();
            if(t2!=0){
                q.add(t1-1);
                q.add(t2-1);
                c++;
            }
            else return c+t1;
        }
        return c;
    }
}