class Solution {
    public String solution(String my_string) {
        StringBuilder answer=new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char ch=my_string.charAt(i);
            if (Character.isLowerCase(ch))
                answer.append(Character.toUpperCase(ch));
            else 
                answer.append(Character.toLowerCase(ch));
        }
        return answer.toString();
    }
}