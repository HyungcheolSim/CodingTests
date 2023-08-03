class Solution {
    public String solution(String rsp) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<rsp.length();i++){
            switch(rsp.charAt(i)){
                case '2'-> sb.append("0"); 
                case '5'-> sb.append("2");
                case '0'-> sb.append("5"); 
            }
        }
        return sb.toString();
    }
}