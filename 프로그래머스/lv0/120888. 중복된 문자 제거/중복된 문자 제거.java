import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb=new StringBuilder();
        for(char ch:my_string.toCharArray()){
            if(sb.indexOf(String.valueOf(ch))==-1)
                sb.append(ch);
        }
        return sb.toString();
    }
}