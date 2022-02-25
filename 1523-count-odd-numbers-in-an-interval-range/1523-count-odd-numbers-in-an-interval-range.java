class Solution {
    public int countOdds(int low, int high) {
      int res=0,temp=0;
        if(low==high&&(low&1)==1)return 1;
        res+=(low&1)+(high&1);
        temp=(res>1)?(high-low-1):high-low;
        res+=temp/2;
        return res;
    }
        
        
        
        
        
        
        
        
        
        
        
    /*    int res=0;
      while(low<=high){
          res+=low&1;
          if(res>1)low+=2;
          else low++;
      }  
        return res;
    }*/
}





// 0-7