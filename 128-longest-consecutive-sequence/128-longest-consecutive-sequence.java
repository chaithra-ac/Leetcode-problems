class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
      HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
           map.put(nums[i],true);
        int count=0,cur=0;
        
        for(int i=0;i<nums.length;i++){
            count=0;cur=nums[i];
            if(!map.containsKey(cur-1)){
           while(map.containsKey(cur)&&map.get(cur)){
            map.put(cur,true);
               ++count;
               ++cur;
               
           }
            }
                 max=Math.max(count,max);
        }
        return max;
    }
}