import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer  = "";
        HashMap<String, Integer> pMap = new HashMap<String, Integer>(participant.length);

        // 1. participant > HashMap으로 변환
        for (String p : participant) {
            pMap.put(p, pMap.getOrDefault(p, 0) + 1);
        }

        // 2. completion 순회하면서 pMap에 있으면 value 감소하기
        for (String c : completion) {
            pMap.put(c, pMap.get(c) - 1);
        }

        // 3. value가 1인 key 찾기
        for (Map.Entry<String, Integer> entry: pMap.entrySet()) {
            if (entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}