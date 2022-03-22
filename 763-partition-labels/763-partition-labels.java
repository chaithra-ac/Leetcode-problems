class Solution {
    HashMap<Character,Integer>map=new HashMap<>();
    List<Integer>list=new ArrayList<>();
    public List<Integer> partitionLabels(String s) {
      int max=0;
      String temp="";
      for(int i=0;i<s.length();i++)
          map.put(s.charAt(i),i);
        
        for(int i=0;i<s.length();i++){
           int maxi=map.get(s.charAt(i));
          if(maxi>max)
              max=maxi; 
             temp+=s.charAt(i); 
            if(max==i){
                list.add(temp.length());
                temp="";
            }
        }
        
     return list;   
    }
}