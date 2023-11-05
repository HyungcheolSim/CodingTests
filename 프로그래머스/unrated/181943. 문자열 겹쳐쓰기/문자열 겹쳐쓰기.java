class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        //s부터 orverwrite_string의 길이만큼 문자열로 바꾼 문자열 리턴
        return my_string.substring(0,s)+overwrite_string+my_string.substring(s+overwrite_string.length());
    }
}