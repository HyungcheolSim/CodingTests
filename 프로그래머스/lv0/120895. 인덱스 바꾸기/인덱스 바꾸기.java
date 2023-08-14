class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] chArr=my_string.toCharArray();
                chArr[num2]=my_string.charAt(num1);
                chArr[num1]=my_string.charAt(num2);
        return String.valueOf(chArr);
    }
}