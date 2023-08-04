import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        // 내가 도전해본 stream
        //return numlist.stream().asList().filter(i->i%n==0).toArray();
        // 정답 stream
        //return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
        List<Integer> list= new ArrayList();
        for(int i:numlist){
            if(i%n==0)
                list.add(i);
        }    
        //list-> 배열
        return list.stream().mapToInt(i->i).toArray();
    }
}