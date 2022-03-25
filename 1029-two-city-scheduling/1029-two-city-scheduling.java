class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int[] dif = new int[n];
        int min = 0, index = 0;
        for(int[] cost : costs){
            dif[index++] = cost[1] - cost[0];
            min += cost[0];
        }
        Arrays.sort(dif);
        
        for(int i = 0; i < n/2; i++){
            min += dif[i];
        }
        return min;
    }
}
