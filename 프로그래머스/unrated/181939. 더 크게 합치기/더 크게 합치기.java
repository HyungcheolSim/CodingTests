class Solution {
    public int solution(int a, int b) {
        String sa=String.valueOf(a);
        String sb=String.valueOf(b);
        int sasb=Integer.parseInt(sa+sb);
        int sbsa=Integer.parseInt(sb+sa);
        return sasb>=sbsa?sasb:sbsa;
    }
}