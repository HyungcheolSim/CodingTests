class Solution {
    public int solution(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            //약수의 개수 구하기
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            sum+=count%2==0?i:i*-1;    
        }
        return sum;
    }
}