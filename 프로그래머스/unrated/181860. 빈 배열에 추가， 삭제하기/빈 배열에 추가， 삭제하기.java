import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        LinkedList<Integer> list =new LinkedList();
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    list.addLast(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    list.removeLast();
                }
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}