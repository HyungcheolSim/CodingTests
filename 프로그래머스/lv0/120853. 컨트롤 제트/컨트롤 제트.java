class Solution {
    public int solution(String s) {
        String[] strArr=s.split(" ");
        int tempNum=0;
        int sum=0;
        for(String str:strArr){
            if(str.equals("Z"))
                sum-=tempNum;
            else{
                tempNum=Integer.parseInt(str);
                sum+=tempNum;
            }
        }
        return sum;
    }
}