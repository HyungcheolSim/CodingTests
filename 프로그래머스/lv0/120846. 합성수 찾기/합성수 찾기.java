class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=4; i<n+1; i++){
            if(i%2==0) {
                answer++; // 4이상 짝수는 전부 합성수
                continue;
            }
            else{
                for(int k=3; k<i/2; k=k+2){
                    if(i%k==0){
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
    //     //4~n까지
    //     int count=0;
    //     for(int i=4;i<=n;i++){
    //         //약수 구하기 j는 1부터 i까지
    //         int num=0;
    //         for(int j=1;j<=i;j++){
    //             if(i%j==0) num++;
    //         }
    //         if(num>=3) count++;
    //     }
    //     return count;
    // }
//}