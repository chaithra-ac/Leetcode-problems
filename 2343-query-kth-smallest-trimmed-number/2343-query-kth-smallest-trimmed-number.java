class Solution{
class Node {
    int ind;
    String s;
    Node(String s, int i) {
        this.s = s;
        this.ind = i;
    }
}
public int[] smallestTrimmedNumbers(String[] nums, int[][] q) {
    int res[] = new int[q.length];
    int itr = 0;
    int n = nums[0].length();
    for(int i = 0 ;i<q.length;i++) {
        ArrayList<Node> al = new ArrayList<>();
        int temp = q[i][1];
        for(int j =0;j<nums.length;j++) {
            al.add(new Node(nums[j].substring(n - temp), j));
        }
		
        Collections.sort(al, new Comparator<Node>(){
            public int compare(Node a, Node b) {
                return (a.s).compareTo(b.s);
            }
        }); 
		
        res[itr++] = al.get(q[i][0]-1).ind; 
    }
    return res;
}
}