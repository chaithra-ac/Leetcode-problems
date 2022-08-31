class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]>list=new ArrayList();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int ind=list.size()-1;
           if(intervals[i][0]>=list.get(ind)[0]&&intervals[i][0]<=list.get(ind)[1]){
               list.get(ind)[1]=Math.max(list.get(ind)[1],intervals[i][1]);
           } 
            else{
                list.add(intervals[i]);
            }
        }
        int[][]res=new int[list.size()][2];
        return list.toArray(res);
    }
}