import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);       
        String[] answer=new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].substring(n,n+1);
        }
        Arrays.sort(answer);

        List<String> strs=new ArrayList<>(Arrays.asList(strings));
        for(int i = 0;i < answer.length; i++){       
            for(int j = 0 ; j < strs.size(); j++){
                if((strs.get(j).charAt(n)+"").equals(answer[i])){
                    answer[i]=strs.get(j);
                    strs.remove(strs.get(j));
                    break;
                }
            }       
        }
        return answer;
    }
}