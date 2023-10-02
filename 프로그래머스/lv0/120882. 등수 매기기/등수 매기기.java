import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        //총합점수(사실상 평균) list 생성,초기화
        scoreList.sort(Comparator.reverseOrder());
        //큰수부터 정렬->반대로도 가능할듯?
        int[] answer= new int[score.length];
        for(int i=0;i<score.length;i++){
            answer[i]=scoreList.indexOf(score[i][0]+score[i][1])+1;
            //0번 인덱스부터 가장 큰 순서니까 score[i][0]+score[i][1]를 값으로 하는 index를 찾고+1
        }
        return answer;
    }
}