class Solution {
    public int solution(int[] sides) {         
        return 2*(sides[0]>sides[1] ? sides[1] : sides[0])-1;
    }
}