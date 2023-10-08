import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q= new LinkedList<>();
        //배열의 원소는 0~9
        //연속적으로 나타나는 숫자는 하나만 남기고 제거
        int tmp=-1;
        for(int i:arr){
            if(tmp==i)
                continue;
            q.offer(i);
            tmp=i;
        }
        int[] answer=new int[q.size()];
        int i=0;
        while(!q.isEmpty()){
            answer[i]=q.poll();
            i++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}