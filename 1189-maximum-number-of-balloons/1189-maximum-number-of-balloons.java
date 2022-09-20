class Solution {
    public int maxNumberOfBalloons(String text) {
        String word="balon";
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++)
            if(word.contains(""+text.charAt(i)))
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        
        if(map.values().size()<word.length())return 0;
            map.put('l',map.get('l')/2);
            map.put('o',map.get('o')/2);
        int min=10000;
        for(int i:map.values())
            min=Math.min(i,min);
        return min;
        
    }
}