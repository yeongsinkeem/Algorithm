import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                int k = i - map.get(c);
                answer[i] = k;
            } else {
                answer[i] = -1;
            }
            map.put(c, i);
        }
        return answer;
    }
}