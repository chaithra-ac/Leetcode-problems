class Solution {
    public double average(int[] salary) {
     int min=salary[0],max=salary[0],sum=0,f=0;
    for(int i=0;i<salary.length;i++){
        sum+=salary[i];
        if(min>salary[i]){
             min=salary[i];
        }
        else if(max<salary[i]){
            max=salary[i];
        }
    }
        return (sum-min-max)/(salary.length-2.0);
    }
}