class Solution {
    public int solution(int n) {
        int answer=1;
        for(int i=1;i<=10;i++){
            if(getFact(i-1)<n){       
                if(getFact(i)>n){
                    return i-1;
                }else if(getFact(i)==n){
                    return i;
                }
            }
        }
        return answer;
    }
    public int getFact(int num){
        if(num<2)
            return 1; 
        return num*getFact(num-1);
    }
}