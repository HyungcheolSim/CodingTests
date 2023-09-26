class Solution {
    public Long solution(String numbers) {
        String[] strArr={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for(int i=0;i< strArr.length;i++){
            if(numbers.contains(strArr[i])){
                numbers=numbers.replaceAll(strArr[i],String.valueOf(i));
            }
        }
        Long answer=Long.parseLong(numbers);
        return answer;
    }
}