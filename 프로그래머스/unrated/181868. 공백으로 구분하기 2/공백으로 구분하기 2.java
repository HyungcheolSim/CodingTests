import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list=new ArrayList();
        for(String s:my_string.split(" ")){
            if(!s.equals("")){
                list.add(s);
            }
        }
        String[] answer= new String[list.size()];
        int idx=0;
        for(String str:list){
            answer[idx++]=str;
        }
        return answer;
    }
}