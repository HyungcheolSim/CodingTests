import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list=new ArrayList<>();
        boolean isDivided=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                isDivided=true;
                list.add(arr[i]);
            }
        }
        if(!isDivided){
            int[] intArr={-1};
            return intArr;
        }
        return list.stream().sorted().mapToInt(x->x).toArray();
    }
}