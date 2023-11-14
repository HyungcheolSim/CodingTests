import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q=new LinkedList();
        List<Integer> list=new ArrayList();

        for(int i=0;i<progresses.length;i++){
            q.offer((int)Math.ceil((100-progresses[i])/(double)speeds[i]));
        }
        
        while(!q.isEmpty()){
            int day=q.poll();
            int count=1;
            while(!q.isEmpty()&&q.peek()<=day){
                q.poll();
                count++;
            }
            list.add(count);
        }

        return list.stream().mapToInt(x->x).toArray();
    }
}