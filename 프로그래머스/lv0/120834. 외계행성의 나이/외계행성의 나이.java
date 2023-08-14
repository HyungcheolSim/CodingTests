class Solution {
    public String solution(int age) {
        String answer = "";

        while(age>0){
            char ch='a';    
            ch+=age%10;
            
            answer=ch+answer;
            age/=10;
        }   
        return answer;
    }
}