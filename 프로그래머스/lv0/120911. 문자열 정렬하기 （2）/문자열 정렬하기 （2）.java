import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] strArr=my_string.toLowerCase().split("");
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strArr);
        for(String s:strArr)
            sb.append(s);
        return sb.toString();
        
    }
}