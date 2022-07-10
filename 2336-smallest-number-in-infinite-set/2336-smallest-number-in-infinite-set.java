class SmallestInfiniteSet {

    HashSet<Integer>set=new HashSet<>();
    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++)
            set.add(i);
        
    }
    
    public int popSmallest() {
        int n=0;
        for(int i:set){
            n=i;
            set.remove(i);break;
        }
        return n;
    }
    
    public void addBack(int num) {
        set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */