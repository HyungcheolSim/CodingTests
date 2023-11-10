import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer=new String[my_string.length()];
        String tempStr=my_string;
        for(int i=0;i<my_string.length();i++){
            answer[i]=tempStr;
            tempStr=tempStr.substring(1);
        }
        Arrays.sort(answer);
        return answer;
    }
}