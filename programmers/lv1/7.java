import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 정답은 배열로 리턴
        // 1. N개 만큼의 해쉬맵 필요
        HashMap<Integer, Double> m = new HashMap<Integer, Double>(N);
        int totalPlayers = stages.length;
        // 2. 실패율 계산
        for (int i = 1; i <= N; i++) {
            int a = 0;  // 분자
            for (int stage : stages) {
                if (stage == i) {
                    a++;
                }
            }
            double failure = totalPlayers == 0 ? 0 : (double) a / totalPlayers;
            totalPlayers -= a;
            m.put(i, failure);
        }
        // 3. hashmap의 value 기준으로 정렬
        List<Map.Entry<Integer, Double>> lst = new LinkedList<>(m.entrySet());
        lst.sort(new Comparator<Map.Entry<Integer, Double>>() {
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0) {
                    return o1.getKey() - o2.getKey();
                } else {
                    // 내림차순 정렬
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        // 4. Key 값만 추출해서 answer 배열에 넣고 리턴
        int i = 0;
        for (Map.Entry<Integer, Double> entry : lst) {
            answer[i] = entry.getKey();
            i++;
        }
        return answer;
    }
}