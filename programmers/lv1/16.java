import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] fruits = new Integer[score.length];
        for (int i = 0; i < score.length; i++)
            fruits[i] = score[i];

        // 1. 정렬
        Arrays.sort(fruits, Collections.reverseOrder());
        // 2. fruits 순회
        for(int i = 1; (i*m) <= score.length; i++) {
            // 3. 가격 계산
            answer += fruits[i*m - 1] * m;
        }

        return answer;
    }
}