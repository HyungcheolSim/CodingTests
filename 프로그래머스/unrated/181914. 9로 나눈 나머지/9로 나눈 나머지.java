class Solution {
    public int solution(String number) {
        //그 정수의 각자리 숫자 합을 9로 나눈 나머지
        int sum=0;
        for(int i=0;i<number.length();i++){
            sum+=Integer.parseInt(number.charAt(i)+"");
        }
        return sum%9;
    }
}