import java.util.*;
class Solution {
    public int solution(int n) {
        //3진법 상에서 앞 뒤로 뒤집은 후 10진법으로 표현한 수
        String answer="";
        //3진법의 역순으로 저장됨
        while(n!=0){
            answer+=n%3;
            n/=3;
        }
        return Integer.parseInt(answer,3);
        
        
    }
}