import java.util.*;
class Solution {
    public String solution(String s) {
        ///큰 것부터 작은 순으로 정렬
        char[] chArr=s.toCharArray();
        Arrays.sort(chArr);
        String answer="";
        for(int i=0;i<chArr.length;i++){
            answer=chArr[i]+answer;
        }
        return answer;
    }
}