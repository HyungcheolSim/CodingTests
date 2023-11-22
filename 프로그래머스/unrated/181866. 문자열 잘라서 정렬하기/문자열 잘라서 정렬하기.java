import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list =new ArrayList();
        for(String s:myString.replace("xx","x").split("x")){
            if(s.isEmpty()){
               continue; 
            }
            list.add(s);
        }
        Collections.sort(list);
        String[] answer=new String[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}