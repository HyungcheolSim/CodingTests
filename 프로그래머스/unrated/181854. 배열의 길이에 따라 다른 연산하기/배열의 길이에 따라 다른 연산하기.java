class Solution {
    public int[] solution(int[] arr, int n) {
        //arr의 길이가 홀수라면?
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(len%2==0){
                if(i%2==1)
                    arr[i]+=n;
            }else{
                if(i%2==0)
                    arr[i]+=n;
            }
        }
        return arr;
    }
}