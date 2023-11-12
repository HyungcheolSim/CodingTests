import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list= new ArrayList();
        for(int i=k;i<=n;i+=k){
            System.out.println(i);
            list.add(i);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}