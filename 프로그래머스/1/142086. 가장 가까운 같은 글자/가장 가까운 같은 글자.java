import java.util.*;
class Solution {
    public int[] solution(String s) {
        //가장 가까운 가까운 글자가 어디 있는지?        
        int[] answer=new int[s.length()];
        int term=0;
        for(int i=0;i<answer.length;i++){
            if(s.indexOf(s.charAt(i))==i){
                //해당글자의 인덱스와 일치하면(처음 나온 글자면) -1
                answer[i]=-1;
            }else{
                //일치하지 않으면
                char ch = s.charAt(i);
                int beforeIndex = s.substring(0,i).lastIndexOf(ch);
                answer[i]=i-beforeIndex;
            }
            //     for(int k=i;k>=0;k--){
            //         if(Character.compare(s.charAt(k),s.charAt(i))==0){
            //             term=k;
            //             break;
            //         }
            //     }
            //     answer[i]=i-term;
            // }
            // term=0;
        }
        return answer;
        
    }
}