class Solution {
    public int lastStoneWeight(int[] stones) {
      Queue<Integer>q=new PriorityQueue<>((n1,n2)->(n2-n1));
       for(int i:stones)
           q.add(i);
        int a=0,b=0;
        while(q.size()>1){
            System.out.println(q);
            a=q.poll();
            b=q.poll();
            if(a<b)
                q.add(b-a);
            else if(b<a)
                q.add(a-b);
            else continue;
        }
        return q.size()>0?q.poll():0;
    }
}