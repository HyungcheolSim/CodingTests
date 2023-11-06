class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum=0;
        int c=a;
        for(int i=0;i<included.length;i++){
            if(included[i])
                sum+=c;
            c+=d;
        }
        return sum;
    }
}