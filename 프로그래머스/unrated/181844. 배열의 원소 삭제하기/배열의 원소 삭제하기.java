import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.removeAll(Arrays.stream(delete_list).boxed().collect(Collectors.toList()));
        int[] answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}