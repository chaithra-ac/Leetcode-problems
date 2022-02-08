class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        if (m > n) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int[] sFreq = new int[26]; // freq counter for string s
        int[] pFreq = new int[26]; // freq counter for string p
        
		// build the freq of p
        for (char c: p.toCharArray()) pFreq[c-'a']++;
        
        char[] strChar = s.toCharArray();
        int i = 0;
        int j = 0;
        
		// buid the freq of the first m-1 chars of string s 
        while (j < m-1) { 
            sFreq[strChar[j] - 'a']++;
            j++;
        }   
        
        while (j < n) { 
			// update sFreq by adding the last char of the sliding window of size m
            sFreq[strChar[j] - 'a']++;
            if (Arrays.equals(sFreq,pFreq)) { 
                result.add(i);
            }
            // update sFreq by removing the first char  of the sliding wind of size m
            sFreq[strChar[i] - 'a']--;
            i++;
            j++;
            
        }
        return result;
    }
                
}

