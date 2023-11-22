class Solution {
    public int[] solution(String myString) {
        String[] strArr=myString.split("x");
        char ch=myString.charAt(myString.length()-1);
        int[] answer=new int[ch=='x'?strArr.length+1:strArr.length];
        for(int i=0;i<strArr.length;i++){
            answer[i]=strArr[i].length();
        }
        return answer;
    }
}