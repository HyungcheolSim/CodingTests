import java.util.*;
class Solution {
    public long[] solution(long n) {
        //n의 자리수를 반복문으로 파악하고 배열의 크기를 정하는 게 더 좋을까 아니면
        //ArrayList로 하는게 좋을까 ->이걸로 해봄
        List<Long> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        long[] arr = new long[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
        //return list.stream().mapToInt(i->i).toArray();
    }
}