class Solution {
    public int furthestBuilding(int[] nums, int bricks, int ladders) {
        int n=nums.length,dis=0;
        Queue<Integer>q=new PriorityQueue<>();
        for(int i=1;i<n;i++){
            dis=nums[i]-nums[i-1];
                if(dis<=0)
                    continue;
            q.add(dis);
            if(q.size()<=ladders)continue;
            if ((bricks -= q.poll()) < 0)
                 return i-1;
            
        }
      return n-1;  
    }
}