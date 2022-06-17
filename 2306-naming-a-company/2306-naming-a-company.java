class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<ideas.length;i++){
            set.add(ideas[i]);
        }
        int[][] mapArr=new int[26][26];
        HashMap<Character,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<ideas.length;i++){
            if(!map.containsKey(ideas[i].charAt(0))){
                map.put(ideas[i].charAt(0),new ArrayList<>());
            }
            map.get(ideas[i].charAt(0)).add(ideas[i]);
        }
        for(char i='a';i<='z';i++){
            for(char j='a';j<='z';j++){
                for(String idea:map.getOrDefault(i,new ArrayList<>())){
                    if(i!=j){
                        String s=String.valueOf(j)+idea.substring(1);
                        if(!set.contains(s)) mapArr[i-'a'][j-'a']++;
                    }
                }
            }
        }
        long ans=(long)0;
        for(char i='a';i<='z';i++){
            for(char j='a';j<='z';j++){
                ans+=mapArr[i-'a'][j-'a']*mapArr[j-'a'][i-'a'];
            }
        }
        return ans;
    }
}
