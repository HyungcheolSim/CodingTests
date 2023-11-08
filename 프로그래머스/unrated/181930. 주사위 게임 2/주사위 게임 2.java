class Solution {
    public int solution(int a, int b, int c) {
        int answer1=a+b+c;
        int answer2=a*a+b*b+c*c;
        int answer3=a*a*a+b*b*b+c*c*c;
        if(a!=b&&b!=c&&a!=c){
            return answer1;
        }if(a==b&&b==c){
            return answer1*answer2*answer3;
        }else{
            return answer1*answer2;
        }
        
    }
}