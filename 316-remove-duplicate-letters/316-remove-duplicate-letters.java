public class Solution {
    public String removeDuplicateLetters(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            map.put(c, i);
        }
        char[] result = new char[map.size()];
        int start = 0;
        for (int i = 0; i < result.length; i++) {
            int end = findMinPos(map);
            char min = 'z' + 1;
            for (int j = start; j <= end; j++) {
                if (map.containsKey(array[j]) && array[j] < min) {
                    min = array[j];
                    start = j + 1;
                }
            }
            result[i] = min;
            map.remove(min);
        }
        
        return String.valueOf(result);
    }
    
    private int findMinPos(HashMap<Character, Integer> map) {
        int pos = Integer.MAX_VALUE;
        for (Integer end : map.values()) {
            pos = Math.min(pos, end);
        }
        return pos;
    }
}
