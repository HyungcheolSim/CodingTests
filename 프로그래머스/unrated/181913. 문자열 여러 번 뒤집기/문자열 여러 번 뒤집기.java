class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer my_string2=new StringBuffer(my_string);
        for(int[] k:queries){
            StringBuffer sb= new StringBuffer(my_string2.substring(k[0],k[1]+1));
            my_string2.replace(k[0],k[1]+1,sb.reverse().toString());
            //my_string=my_string.replace(sb.toString(),sb.reverse().toString());
        }
        return my_string2.toString();
    }
}