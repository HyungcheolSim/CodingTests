class Solution {
    public int solution(String s) {
        String[] arr= s.split(" ");
        int sum=0;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equals("Z")){
                if(arr[i-1].contains("-")){
                    arr[i]=arr[i-1];
                    arr[i]=arr[i].substring(1);
                }else{
                    arr[i]="-"+arr[i-1];
                }

            }
            sum+=Integer.parseInt(arr[i]);
        }
        return sum;
    }
}