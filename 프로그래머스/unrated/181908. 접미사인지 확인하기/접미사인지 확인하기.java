import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] answer=new String[my_string.length()];
        for(int i=0;i<answer.length;i++){
            answer[i]=my_string.substring(i);
        }
        return Arrays.asList(answer).contains(is_suffix)?1:0;
    }
}