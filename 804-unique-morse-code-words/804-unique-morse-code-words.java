class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      String []s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray())
                sb.append(s[c-'a']);
            
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}