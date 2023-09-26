class Solution {
    public String solution(String my_string, String alp) {
        //영소문자 하나이므로 split 할 필요 없이 바로 해도 가능!
        // String[] arr=alp.split("");
        // for(int i=0;i<arr.length;i++){
        //     my_string=my_string.replace(arr[i],arr[i].toUpperCase());
        // }
        // return my_string;
        String big=alp.toUpperCase();
        return my_string.replace(alp,big);
    }
}