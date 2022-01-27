class Solution {
        List<Integer>l=new ArrayList<>();
    public List<Integer> findClosestElements(int[] a, int k, int x) {
            int n=a.length,p=0;
           for(int i=0;i<n;i++){
                   if(a[i]>x){     
                     p=i-1;break;      
                   }
           }
                 if(x<=a[0])p=0;
                   if(a[n-1]<=x)
                           p=n-1;
                int f=p+1,c=0,y=0;
            System.out.print(p);
             while(k!=0&&p>=0&&f<n){
                    c=Math.abs(a[p]-x);
                    y=Math.abs(a[f]-x);
                     if(c<y||c==y&&a[p]<a[f]){
                             l.add(a[p--]);
                             k--;
                     }
                     else{
                             l.add(a[f++]);
                             k--;
                             
                     }
             }
             while(k!=0&&p<0){
                     l.add(a[f++]);
                     k--;
                     
             }
                while(k!=0&&f>=n){
                        l.add(a[p--]);
                                k--;
                }
                Collections.sort(l);
            return l;
                        
        }
}