class Solution {
    public int[] solution(String myString) {
        String[] strArr=myString.split("x");
        char ch=myString.charAt(myString.length()-1);
        int[] answer=new int[ch=='x'?strArr.length+1:strArr.length];
        for(int i=0;i<strArr.length;i++){
            int len=strArr[i].length();
            if(len>1){
                answer[i]=len;
            }
            else if(len==1&&strArr[i].equals(" ")){
                answer[i]=0;
            }else
                answer[i]=len;
        }
        return answer;
    }
}