class Solution {
    int max;
    public int minPartitions(String n) {
        // long num=Integer.parseLong(n);
        // int[]nums={0,1,10,11,100,101,1000,1001,10000,10001,100000};
        for(int i=0;i<n.length();i++){
           max=Math.max(n.charAt(i),max);
            if(max==57)break;
        }
        return Character.getNumericValue(max);
    }
}