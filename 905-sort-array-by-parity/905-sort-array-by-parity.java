class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int i=0,j=nums.length-1;
        while(i<j){
            while(i<nums.length&&nums[i]%2==0)i++;
            while(j>=0&&nums[j]%2!=0)j--;
            if(i<j&&nums[i]%2!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
                i++;
                j--;
                // System.out.println(Arrays.toString(nums));
            
            
        }
        return nums;
    }
}