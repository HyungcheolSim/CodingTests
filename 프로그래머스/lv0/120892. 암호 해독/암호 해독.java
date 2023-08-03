class Solution {
    public String solution(String cipher, int code) {
        //code의 배수번째 글자만 암호다.
        StringBuilder sb=new StringBuilder();
        for(int i=code-1;i<cipher.length();i+=code){
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}