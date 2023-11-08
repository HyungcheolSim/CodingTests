class Solution {
    public int solution(int n, String control) {
        for(char ch:control.toCharArray()){
            if(ch=='w')
                n++;
            if(ch=='s')
                n--;
            if(ch=='d')
                n+=10;
            if(ch=='a')
                n-=10;
        }
        return n;
    }
}