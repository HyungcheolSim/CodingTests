class Solution {
    public int[] solution(int num, int total) {
        //num 개의 원소가 들어가는 배열
        int numsum=0;
        int[] answer = new int[num];
        //num번 순차적으로 더한 값은 num*x+(1~num-1까지 합)=numsum
        //즉 total-numsum/num=x
        for(int i=1;i<num;i++){
            numsum+=i;
        }
        int x= (total-numsum)/num;
        //배열에 넣기
        for(int i=0;i<num;i++){
            answer[i]=x+i;
        }
        return answer;
    }
}