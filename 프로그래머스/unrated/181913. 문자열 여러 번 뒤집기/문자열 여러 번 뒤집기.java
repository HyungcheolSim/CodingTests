class Solution {
    public String solution(String myString, int[][] queries) {
        for (int[] arr : queries) {
            myString = myString.substring(0, arr[0]) 
                + new StringBuilder(myString.substring(arr[0], arr[1] + 1)).reverse().toString() 
                + myString.substring(arr[1] + 1);
        }
        return myString;
    }
}