class Solution {
    public int lenLongestFibSubseq(int[] nums) {
        int j=0,k=nums.length,max=0,c=0,x=0,temp=0,s=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
       for(int i=0;i<nums.length-2;i++){
           x=i;j=i+1;
           while(j<k){
               c=2;
               s=j;
               while(map.containsKey(nums[x]+nums[j])){
                 c++;
                   // System.out.print(j+" ");
                   temp=map.get((nums[x]+nums[j]));
                      x=j;
                      j=temp;
               }
               if(!map.containsKey(nums[x]+nums[j])){ 
                   j=++s;
                   x=i;
                  max=Math.max(max,c);
              }
                 }
       } 
        return max>2?max:0;
    }
}