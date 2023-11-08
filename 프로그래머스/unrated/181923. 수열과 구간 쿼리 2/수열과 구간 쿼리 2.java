import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list=new ArrayList();
        int count=0;
        for(int[] k:queries){
            int start=k[0];
            int end=k[1];
            int min=k[2];
            
            int[] tempArr=Arrays.copyOfRange(arr,start,end+1);
            Arrays.sort(tempArr);
            int num = -1;
            for(int i:tempArr){
                if(i>min){
                    num=i;
                    break;
                }
            }
            list.add(num);
        }
     return list.stream().mapToInt(x->x).toArray();
    }
}