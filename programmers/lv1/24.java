import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // 1. today 일 수 기준으로 더하기
        String[] todayArr = today.split("[.]");
        int privacyDate = (Integer.parseInt(todayArr[0]) * 28 *12) +
                            (Integer.parseInt(todayArr[1]) * 28) +
                            Integer.parseInt(todayArr[2]);

        // 2. terms > map으로 변환
        for (int i = 0; i < terms.length; i++) {
            String[] tm = terms[i].split(" ");
            // map은 [(Z, 3), (D, 5)]
            map.put(tm[0], Integer.parseInt(tm[1]));
        }

        // 3. privacies 순회하며 유효기간 체크
        for (int i = 0; i < privacies.length; i++) {
            String[] pr = privacies[i].split(" ");
            String term = pr[1]; // 약관
            String[] prDate = pr[0].split("[.]"); // 날짜 얼마나 지났는지

            int checkDate = (Integer.parseInt(prDate[0]) * 28 * 12) +
                            (Integer.parseInt(prDate[1]) * 28) +
                             Integer.parseInt(prDate[2]) + (map.get(term)*28);
            if ( privacyDate >= checkDate) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}