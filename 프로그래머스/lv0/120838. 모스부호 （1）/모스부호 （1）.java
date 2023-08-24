class Solution {
    public String solution(String letter) {
        String[] morse=new String[]
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] eng=new char[morse.length];
        String answer="";

        for(int i=0;i<eng.length;i++){ //알파벳 배열 초기화
           eng[i] = (char) ('a'+i);
        }
        //letter 자르기
        String[] letterarray = letter.split(" ");

        //찾아서 문장을 완성
        for(String str:letterarray){
            for(int i=0;i<morse.length;i++){
                if(str.equals(morse[i])){
                    answer+=eng[i];
                }
            }
        }
        return answer;
    }
}