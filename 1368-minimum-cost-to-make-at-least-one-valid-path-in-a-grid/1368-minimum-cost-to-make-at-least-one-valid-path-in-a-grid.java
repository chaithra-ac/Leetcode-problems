class Solution {
    public static class Pair {
		int i;
		int j;
		int swaps;
		public Pair(int i, int j, int swaps) {
			this.i = i;
			this.j = j;
			this.swaps = swaps;
		}
	}

	public int minCost(int[][] grid) {
		int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->a.swaps-b.swaps);
        
		q.add(new Pair(0, 0, 0));
        
		while (!q.isEmpty()) {
            
			Pair r = q.poll();
            
			if (r.i == grid.length - 1 && r.j == grid[0].length - 1)
				return r.swaps;
            
			if (visited[r.i][r.j])
				continue;
			visited[r.i][r.j] = true;
			for (int k = 0; k < 4; k++) {
				int i = r.i + dirs[k][0];
				int j = r.j + dirs[k][1];
				if (i >= 0 && j >= 0 && i <= grid.length - 1 && j <= grid[0].length - 1) {
					if (grid[r.i][r.j] == k + 1)
						q.add(new Pair(i, j, r.swaps));
					else 
						    q.add(new Pair(i, j, r.swaps + 1));
				}
			}

		}
		return -1;
	}
}
