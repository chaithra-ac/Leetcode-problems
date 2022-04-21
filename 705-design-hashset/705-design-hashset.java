class MyHashSet {
    int[]ary;
    public MyHashSet() {
      ary=new int[1000001];  
    }
    
    public void add(int key) {
      ary[key]=-1;
    }
    
    public void remove(int key) {
      ary[key]=0;  
    }
    
    public boolean contains(int key) {
        return ary[key]==-1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */