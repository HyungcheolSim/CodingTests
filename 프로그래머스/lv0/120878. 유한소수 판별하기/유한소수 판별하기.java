import java.util.*;
class Solution {
    public int solution(int a, int b) {
        for(int i=2;i<=a;i++){
            if(a%i==0&&b%i==0){
                a=a/i;
                b=b/i;
            }   
        }
        //이제 a/b 는 기약분수
        //
        int answer=0;
        for(int i=2;i<=b;i++){
            if(b%i==0){
                //인수 일 때 2나 5
                if(i%2!=0&&i%5!=0)
                    answer=2;
            }
        }
        return answer==2?2:1;
    }
}