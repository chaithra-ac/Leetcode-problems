class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
     int s=people.length,n=people.length,i=0;
     int j=n-1;
       Arrays.sort(people); 
        while(i<n&&j>0&&i<j){
           if(people[j]>=limit||people[i]+people[j]>limit){
               j--;
            }
            else{
                i++;
                j--;
                s--;
            // System.out.println(s+" "+i+" "+j);
            }
        }
        return s;
    }
}