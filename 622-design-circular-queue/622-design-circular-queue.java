class MyCircularQueue {

     List<Integer>list;
    int capacity;
    public MyCircularQueue(int k) {
        capacity=k;
       list=new ArrayList<>(capacity);  
    }
    
    public boolean enQueue(int value) {
        if(list.size()>=capacity)
            return false;
       return list.add(value); 
    }
    
    public boolean deQueue() {
         if(list.isEmpty())
             return false;
        
            list.remove(0);
            return true;
    }
    
    public int Front() {
       return !list.isEmpty()?list.get(0):-1; 
    }
    
    public int Rear() {
       return !list.isEmpty()?list.get(list.size()-1):-1;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return list.size()==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */