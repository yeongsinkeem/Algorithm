import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> namelst = new ArrayList<>(Arrays.asList(name));

        // 1. photo 배열 순회하면서 점수 계산
        for (int i = 0; i < photo.length; i ++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (namelst.contains(photo[i][j])) {
                    int idx = namelst.indexOf(photo[i][j]);
                    score += yearning[idx];
                }
            }
            // 2. answer에 값 추가
            answer[i] = score;
        }
        return answer;
    }
}