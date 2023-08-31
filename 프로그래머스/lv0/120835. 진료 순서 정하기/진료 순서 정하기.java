class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = new int[emergency.length];
        for(int i=0;i<emergency.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(emergency[i]<=emergency[j])
                    count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}