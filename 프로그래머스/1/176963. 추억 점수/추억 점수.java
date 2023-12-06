class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer= new int[photo.length];
        int idx=0;
        int sum=0;
        for(String[] arr:photo){
            for(String s:arr){
                for(int i=0;i<name.length;i++){
                    if(name[i].equals(s)){
                        sum+=yearning[i];
                    }
                }
            }
            answer[idx++]=sum;
            sum=0;
        }
        return answer;
    }
}