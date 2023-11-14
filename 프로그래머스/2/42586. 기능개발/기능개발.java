import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<progresses.length;i++){
            int date = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            if(!q.isEmpty() && q.peek() < date){
                list.add(q.size());
                q.clear();
            }
            q.offer(date);
        }
        list.add(q.size());

        return list.stream().mapToInt(x->x).toArray();
    }
}