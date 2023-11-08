import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer=Arrays.copyOfRange(num_list,0,num_list.length+1);
        int last=num_list[num_list.length-1];
        int ll=num_list[num_list.length-2];
        answer[num_list.length]=last>ll?last-ll:last*2;
        return answer;
    }
}