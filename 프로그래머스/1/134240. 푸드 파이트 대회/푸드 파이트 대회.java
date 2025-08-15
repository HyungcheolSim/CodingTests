class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder("0");
		for (int i = food.length-1; i >0; i--) {
			int amount = food[i];
			while (amount > 1) {
				sb.insert(0, i);
				sb.append(i);
				amount-=2;
			}
		}
		return sb.toString();
	}
}