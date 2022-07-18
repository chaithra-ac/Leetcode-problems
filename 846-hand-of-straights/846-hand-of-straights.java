class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        Arrays.sort(hand);
       HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:hand)map.put(i,map.getOrDefault(i,0)+1);
       
        // System.out.println(map.keySet()+" "+map.values());
 
        int g=hand.length/groupSize;
        for(int i=0;i<hand.length;i++){
          if(map.get(hand[i])>0){
              boolean possible=group(hand[i],map,groupSize);
              if(possible)
                  --g; 
              else
                  return false;
          }
        // System.out.println(map.keySet()+" "+map.values()+" "+g);
            
        }
        return true;
    }
    boolean group(int num,HashMap<Integer,Integer>map,int s){
        int pre=num;
        while(s>0){
           if(map.containsKey(pre)&&map.get(pre)>0){
               --s;
               map.put(pre,map.get(pre)-1);
               ++pre;
           }
            else return false;
        }
        return true;
    }
}