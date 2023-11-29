import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] answer=new int[31];                               
        int max=0;
        for(String s:strArr){
            for(int i=1;i<=answer.length;i++){
                if(s.length()==i){
                    answer[i]++;
                }
            }
        }
        for(int i:answer){
            if(i>max)
                max=i;
        }
        return max;
    }
}