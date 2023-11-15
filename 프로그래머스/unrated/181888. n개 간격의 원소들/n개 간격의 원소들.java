import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list =new ArrayList();
        list.add(num_list[0]);
        for(int i=n;i<=num_list.length-1;i+=n){
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}