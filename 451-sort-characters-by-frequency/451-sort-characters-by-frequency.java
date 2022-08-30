class Solution {
    public String frequencySort(String s) {
        String[]cap=new String[75];
        Map<Character,Integer>map=new HashMap<>();
        
        for(char c:s.toCharArray()){
            if(cap[c-'0']==null)cap[c-'0']="";
                cap[c-'0']+=c;
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Character>q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(char c:map.keySet())
            q.offer(c);
        
        StringBuilder sb=new StringBuilder();
        
        while(!q.isEmpty())
                sb.append(cap[q.poll()-'0']);
        
     return sb.toString();   
    }
}