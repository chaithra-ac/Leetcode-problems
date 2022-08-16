class Solution {
    public int findUnsortedSubarray(int[] nums) {
      Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int l=n,r=0;
        for(int i=0;i<n;i++){
          while(!stack.isEmpty()&&nums[stack.peek()]>nums[i])
              l=Math.min(l,stack.pop());
              stack.push(i);
          }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i])
                r=Math.max(r,stack.pop());
            stack.push(i);
                
            }
    return r-l>0?r-l+1:0;
    }
}