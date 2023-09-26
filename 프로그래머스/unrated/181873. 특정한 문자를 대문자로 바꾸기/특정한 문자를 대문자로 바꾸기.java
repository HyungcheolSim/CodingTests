class Solution {
    public String solution(String my_string, String alp) {
        String[] arr=alp.split("");
        for(int i=0;i<arr.length;i++){
            my_string=my_string.replace(arr[i],arr[i].toUpperCase());
        }
        return my_string;
    }
}