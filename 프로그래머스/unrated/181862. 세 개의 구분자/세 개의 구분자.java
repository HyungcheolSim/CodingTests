import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list= new ArrayList();
        for(String s:myStr.split("[a-c]")){
            if(s.length()!=0)
                list.add(s);
        }
        if(list.size()==0)
            return new String[] {"EMPTY"};
        String[] answer=new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);        
        }
        return answer;
    }
}