class Solution {
    public int solution(int[] number) {
        //3총사인 경우 number.length C 3 의 합이 0이면 count++
        int answer = 0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]==-number[k])
                        answer++;
                }
            }
        }

        return answer;
    }
}