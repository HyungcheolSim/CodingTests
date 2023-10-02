class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] i:db){
            if(i[0].equals(id_pw[0])){
                return i[1].equals(id_pw[1])?"login":"wrong pw";
            }
        }
        return "fail";
    }
}