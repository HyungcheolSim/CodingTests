import java.util.*;
class Solution {
    public long solution(long n) {
        List<Long> list= new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        long answer = 0;
        Collections.sort(list,Collections.reverseOrder());
        for(Long i:list){
            answer*=10;
            answer+=i;
        }
        return answer;
    }
}