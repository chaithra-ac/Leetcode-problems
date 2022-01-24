class Solution {
    public boolean stoneGame(int[] piles) {
        
        return didAlexWin(piles, 0, 0, 0, piles.length-1);
    }
    public boolean didAlexWin(int[] piles, int alex, int lee, int i, int j)
    {
        if(i>=j || i>=piles.length || j<0)
            return (alex>=lee);
         
        if(didAlexWin(piles, alex+piles[i],lee+piles[j],++i,--j))
            return true;
        else
            return (didAlexWin(piles, alex+piles[j],lee+piles[i],++i,--j));
       
    }
}
