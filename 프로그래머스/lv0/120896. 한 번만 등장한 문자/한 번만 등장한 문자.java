import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer= s.split("");
        Arrays.sort(answer);
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<answer.length;i++){
            int count=0;
            for(int j=0;j<answer.length;j++){
                if(Objects.equals(answer[i],answer[j])){
                    count++;
                }
            }
            if(count==1){
                sb.append(answer[i]);
            }
        }
        return sb.toString();
    }
}