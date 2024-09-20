import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        // strings 배열 리스트로 변환 > collections.sort 함수 사용 위해
        List<String> words = Arrays.asList(strings);
        Collections.sort(words, (o1, o2) -> {
            int result = o1.charAt(n) - o2.charAt(n);
            if (result == 0)
                return o1.compareTo(o2);
            return result;
        });

        int i = 0;
        for (String word : words) {
            answer[i] = word;
            i++;
        }

        return answer;
    }
}