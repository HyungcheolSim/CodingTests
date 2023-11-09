import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        List<Integer> list= new ArrayList();
        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else{
                int last=list.get(list.size()-1);
                if(last<arr[i]){
                    list.add(arr[i]);
                    i++;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}