/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee>map=new HashMap<>();
        for(Employee emp:employees){
            // System.out.println(emp.id);
            map.put(emp.id,emp);
        }
        
        Queue<Integer>q=new LinkedList<>();
        q.add(id);
        int totImp=0,curIn=id;
        while(!q.isEmpty()){
        // System.out.println(q+" "+totImp);
           int n=q.poll();
           totImp+=map.get(n).importance;
            for(int i:map.get(n).subordinates){
                    q.add(i);
            }
            
        }
        return totImp;
    }
}