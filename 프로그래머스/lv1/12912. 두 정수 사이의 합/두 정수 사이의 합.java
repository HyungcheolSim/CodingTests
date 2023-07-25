class Solution {
    public long solution(int a, int b) {
        long sum=0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) {
            sum+=i;
        }
        return sum;
    }
    /*
        등차수열의 일반항 첫째항+구하는 항이 몇번째인지(n)-1*차수(d)
        여기서는 차수 1 
        등차수열의 합
        마지막 항(l) = an=a+(n-1)d
        첫째항이 a, 마지막 행이 l일 때 
        첫째항이 a, 공차가 d일 때, n(2a+(n-1)d)/2
        (b - a + 1) * (a + b) / 2;
        첫째항부터 마지막행까지 합=Sn=n(a+l)/2
    */
}