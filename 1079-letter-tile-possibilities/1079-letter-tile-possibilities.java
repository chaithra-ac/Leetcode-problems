class Solution {
    public int numTilePossibilities(String tiles) {
        int len=tiles.length(),ans = 0;
        Set<String> seen = new HashSet<>();
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        tiles = new String(chars);
        for(int i = 1; i < (1 << len); i++) {
            int[] cnt = new int[26];
            int total = 0, dup = 1;
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < len; j++) {
                if((i & (1 << j)) != 0) {
                    cnt[tiles.charAt(j) - 'A']++;
                    total++;
                    str.append("" + tiles.charAt(j));
                }
            }
            if(seen.contains(str.toString())) continue;
            for(int j = 0; j < 26; j++) {
                dup *= cal(cnt[j]);
            }
            ans += cal(total) / dup;
            seen.add(str.toString());
        }
        return ans;
    }
    
    int cal(int x) {
        if(x==0) return 1;return x*cal(x-1);
    }
}
/*subset aab             -   aab,aa,a,b,ab 
permute all if length is >1 {
                             aab-aab,aba,baa
                             aa-aa
                             ab-ab,ba}
                             set all;*/