import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        if (map.size() == 1) return a * 1111;
        if (map.size() == 2) {
            if (map.containsValue(3)) {
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return answer * answer;
            }
            int x = (a + b + c + d - 2 * a) / 2; //a+b+c+d = 2p+2q -2q=2p/2 =p
            return (a + x) * Math.abs(a - x);
        }
        if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> el : map.entrySet())
                // ad 2, b 1, c 1
                if (el.getValue() != 2) answer *= el.getKey();// 1*b*c
            return answer;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}