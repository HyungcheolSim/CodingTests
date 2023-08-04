import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        //정답 배열이 빈 배열인 경우 -1 리턴
        if(arr.length==1){
            return new int[] {-1};
        }
        
        int[] answer;

        //최소값 구하기
        int min=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        //새 arraylist에 넣기
        List<Integer> list= new ArrayList<>();
        for(int i:arr){
            if(i==min)
                continue;
            list.add(i);
        }
        //arraylist 배열로 변환
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
        
    }
}