class Solution {
    public int solution(int a, int b) {
        int cal=Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int com=2*a*b;
        return cal>=com?cal:com;
    }
}