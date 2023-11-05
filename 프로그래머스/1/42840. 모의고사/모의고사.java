import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //1번 1~5 반복
        //2번 숫자 사이사이 2 섞기
        int [] twoAns={2,1,2,3,2,4,2,5};
        //3번 3311224455반복
        int[] threeAns={3,3,1,1,2,2,4,4,5,5};
        int[] supo=new int[3];
        for(int i=1;i<=answers.length;i++){
            int num1= (i%5==0)?i%5+5:i%5;
            int num2= twoAns[(i%8==0)?i%8+7:i%8-1];
            int num3= threeAns[(i%10==0)?i%10+9:i%10-1];
            if(answers[i-1]== num1){
                supo[0]++;
            }if(answers[i-1]==num2){
                supo[1]++;
            }if(answers[i-1]==num3){
                supo[2]++;
            }
        }
        
        int max=Math.max(supo[0],Math.max(supo[2],supo[1]));
        int min=Math.min(supo[0],Math.min(supo[2],supo[1]));
        int mid;
        List<Integer> grade =new ArrayList();
        for(int i=0;i<supo.length;i++){
            if(supo[i]==max){
                grade.add(i+1);
            }
        }    
        return grade.stream().mapToInt(x->x).toArray();
    
    }
}