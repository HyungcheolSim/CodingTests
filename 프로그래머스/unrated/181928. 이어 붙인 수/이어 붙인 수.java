class Solution {
    public int solution(int[] num_list) {
        String o="";
        String e="";
        for(int i=0;i<num_list.length;i++){
            String str=String.valueOf(num_list[i]);
            if(num_list[i]%2==1){
                o+=str;
            }else{
                e+=str;
            }
            
        }
        return Integer.parseInt(o)+ Integer.parseInt(e);
    }
}