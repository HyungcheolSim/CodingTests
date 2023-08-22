class Solution {
    public int solution(int num, int k) {
        String str= String.valueOf(num);
        String sk=String.valueOf(k);
        int answer= str.contains(sk)?str.indexOf(sk)+1:-1;
        return answer;
    }
}