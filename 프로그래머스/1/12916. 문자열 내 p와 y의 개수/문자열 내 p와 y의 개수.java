class Solution {
    boolean solution(String s) {
        String str=s.toLowerCase();
        if(str.contains("p")||str.contains("y")){
            int pcnt=0;
            int ycnt=0;
            for(char ch:str.toCharArray()){
                if(ch=='p')
                    pcnt++;
                else if(ch=='y')
                    ycnt++;
            }
            return pcnt==ycnt;
        }
        return true;
    }
     //stream
     //s = s.toUpperCase();
     //
     //   return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    //regex
    //return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
}