class Solution {
public int maxProduct(String[] words) {
int max= 0,len = words.length;
Arrays.sort(words,(a,b)->b.length()-a.length());
    // System.out.print(Arrays.toString(words));
    for(int i=0;i<len-1;i++){
        for(int j=i+1;j<len;j++){
            int f = 0;
            for(int k=0;k<words[j].length();k++){
                if(words[i].contains(""+words[j].charAt(k))){
                    f=1;
                    break;
                }
            }
            if(f==0){
                max = Math.max(max,words[i].length()*words[j].length());
                break;
            }
        }
    }
    return max;
}
}

