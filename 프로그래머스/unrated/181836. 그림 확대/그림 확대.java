class Solution {
    public String[] solution(String[] picture, int k) {
        //k번 반복 추가, 원소의 내용도 하나씩 3번씩 추가
        String[] answer= new String[picture.length*k];
        int idx=0;
        for(String s:picture){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append((s.charAt(i)+"").repeat(k));
            }
            int j=0;
            while(j<k){
                answer[idx++]= sb.toString();
                j++;
            }
        }
        return answer;
    }
}