class Solution {
    public int solution(String A, String B) {
        int answer=0;
        String copy=A;
        for(int j=0;j<A.length();j++){
            if(copy.equals(B)){
                return answer;
            }
            //맨 뒤에서 한글자 자른걸 a에 저장
            String a=copy.substring(copy.length()-1);
            //a+자르기전까지문자열
            copy=a+copy.substring(0, copy.length()-1);
            answer++;
        }
        return -1;
    }
}