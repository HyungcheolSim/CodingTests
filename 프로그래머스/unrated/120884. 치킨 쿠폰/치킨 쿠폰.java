class Solution {
    public int solution(int chicken) {
        return (chicken>1&&chicken%9==0)?chicken/9-1:chicken/9;
    }
}