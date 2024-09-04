// 12:48 - 3:05
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        // 성격 유형과 점수를 저장할 Map
        Map<Character, Integer> scores = new HashMap<>();
        // 성격 유형 초기화
        for (char type : new char[] {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            scores.put(type, 0);
        }
        // 1. 점수 계산
        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int choice = choices[i];
            int score = choice - 4;

            // score가 양수라면 동의(오른쪽)
            if (score > 0) {
                scores.put(type2, scores.get(type2) + score);
            }
            else if (score < 0) {
                scores.put(type1, scores.get(type1) - score);
            }
        }
        // scores에는 각 유형별 몇 점인지 나와있음 > 이제 answer에 각 유형을 기재할 시간

        // 2. 성격 유형 결과 계산
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (int i = 0; i < types.length; i += 2) {
            char type1 = types[i];
            char type2 = types[i+1];
            // 각 유형별 점수 가져오기
            int score1 = scores.get(type1);
            int score2 = scores.get(type2);

            if (score1 >= score2) {
                answer += type1;
            }
            else {
                answer += type2;
            }
        }
        return answer;
    }
}