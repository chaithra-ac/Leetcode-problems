class Solution {
    public double average(int[] salary) {
     int min=salary[0],max=salary[0],sum=0,f=0;
        // System.out.println(sum);
    for(int i=1;i<salary.length;i++){
        // sum+=salary[i];
        if(min>salary[i]){
            if(f==1)
                sum+=min;
             min=salary[i];
        }
        else if(max<salary[i]){
            if(f==1)
                sum+=max;
            max=salary[i];
        }
        else sum+=salary[i];
        f=1;
        
        
                System.out.println(sum+" "+min+" "+max);
    }
        return sum/(salary.length-2.0);
    }
}