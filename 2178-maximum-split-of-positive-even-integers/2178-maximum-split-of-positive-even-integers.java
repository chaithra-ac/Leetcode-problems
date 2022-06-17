class Solution {
   /* public List<Long> maximumEvenSplit(long finalSum) {
       List<Long>res=new ArrayList<>();
        // if(finalSum%2!=0)return res;
        long sum=0;
        for(long i=2;i<finalSum;i+=2){
            sum+=i;
            res.add(i);
            if(sum==finalSum)return res;
           if(sum>finalSum)break;
        }
        res.remove(sum-finalSum);
        return res;
    }*/
            public List<Long> maximumEvenSplit(long f) {
        LinkedList<Long> ans = new LinkedList<>();
        if (f % 2 == 0) {
            long i = 2;
            while (i <= f) {
                ans.offer(i);
                f -= i;
                i += 2;
            } 
            ans.offer(f + ans.pollLast());
        }
        return ans;
    }

}