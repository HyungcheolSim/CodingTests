class Solution {
    public int solution(int[] numbers) {
        //numbers 배열에 없는 수를 모두 더한 것=> 0~9를 모두 더하고 numbers 배열의 원소들을 빼면 될듯?
        //0~9까지 수의 합 n(n-1)/2
        int sum=45;
        for(int i=0;i<numbers.length;i++){
            sum-=numbers[i];
        }
        return sum;
    }
}