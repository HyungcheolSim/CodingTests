import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        //return numlist.stream().asList().filter(i->i%n==0).toArray();
        List<Integer> list= new ArrayList();
        for(int i:numlist){
            if(i%n==0)
                list.add(i);
        }    
        //list-> 배열
        return list.stream().mapToInt(i->i).toArray();
    }
}