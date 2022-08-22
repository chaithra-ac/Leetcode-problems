class Solution {
    int res=Integer.MIN_VALUE,c=0;
    public int countMaxOrSubsets(int[] nums) {
       return compute(nums,0,0);
    }
    int compute(int[]nums,int ind,int xor){
        if(ind>=nums.length){
            if(res==xor)
                ++c;
            else if(res<xor){
                res=xor;c=1;
            }
            return c;
        }
        compute(nums,ind+1,xor|nums[ind]);
        compute(nums,ind+1,xor);
        return c;
    }
}