class Solution {
    public Long solution(String numbers) {
        String[] arr= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<arr.length;i++){
            if(numbers.contains(arr[i])){
                numbers=numbers.replace(arr[i],String.valueOf(i));
            }
        }
        return Long.parseLong(numbers);
    }
}