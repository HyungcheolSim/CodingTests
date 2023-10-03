import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //기약분수 만들기
        for(int i=2;i<=a;i++){ //2~a까지 나눠지는 수로 나눔
            if(a%i==0&&b%i==0){
                a=a/i;
                b=b/i;
            }
        }
        
        //b가 2와 5로만 이루어진 소인수여야 한다.\
        //2만 5만 2,5만
        for(int j=2;j<=b;j++){
            if(b%j==0){
                if(j%2!=0&&j%5!=0){
                    answer=2;
                }
            }
        }
        return answer==2?2:1;
    }
}