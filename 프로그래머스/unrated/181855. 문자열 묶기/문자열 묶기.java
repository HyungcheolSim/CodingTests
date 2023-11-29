import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] answer=new int[31];                               
        int max=0;
        for(String s:strArr){
            answer[s.length()]++;
        }
        for(int i:answer){
            max=Math.max(max,i);
        }
        return max;
    }
}