class Solution {
    public String solution(String s) {
        String[] arr=s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(arr[0]);
        for(int i=0;i<arr.length;i++){
            n = Integer.parseInt(arr[i]);
            if(n>max) max=n;
            if(n<min) min=n;
        }
        return min+" "+max;
    }
}