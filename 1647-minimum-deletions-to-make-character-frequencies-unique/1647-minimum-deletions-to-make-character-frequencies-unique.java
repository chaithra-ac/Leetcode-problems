
class Solution {
    public int minDeletions(String s) {
       HashMap<Character,Integer>h=new HashMap<>();
        for(char i:s.toCharArray())
            h.put(i,h.getOrDefault(i,0)+1);
        HashSet<Integer>u=new HashSet<>();
        int c=0;
        for(int i:h.values()){
            if(!u.contains(i)){
                u.add(i);
            }
            else{
            while(i!=0&&u.contains(i)){
                i--;
                c++;
                }
            u.add(i);
            }
        }
        return c;
    }
}