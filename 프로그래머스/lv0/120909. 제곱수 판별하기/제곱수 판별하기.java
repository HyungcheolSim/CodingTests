class Solution {
    public int solution(int n) {
        //정수형으로 바꿔도 제곱근 계산한 것과 같으면 특정 정수로 나누어떨어지는 제곱수라고 할 수 있다고 생각
        return (int)Math.sqrt(n)==Math.sqrt(n)?1:2;
    }
}