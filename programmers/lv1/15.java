import java.util.*;

class Solution{
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        // 1. 반복적인 패턴 리스트에 추가
        int[] pattern1 = {1, 2, 3, 4, 5};
        for(int i = 0; i < answers.length; i++) {
            s1.add(pattern1[i % pattern1.length]);
        }
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        for (int i = 0; i < answers.length; i++) {
            s2.add(pattern2[i % pattern2.length]);
        }
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < answers.length; i++) {
            s3.add(pattern3[i % pattern3.length]);
        }

        // 2. answers 순회하면서 채점
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == s1.get(i)) a1++;
            if (answers[i] == s2.get(i)) a2++;
            if (answers[i] == s3.get(i)) a3++;
        }

        // 3. 최댓값 구하기
        int maxScore = Math.max(a1, Math.max(a2, a3));

        // 4. 최대 점수를 받은 사람 리스트에 추가
        // 최대 점수를 받은 사람은 몇 명인지 모르기 때문에 리스트 사용
        List<Integer> result = new ArrayList<>();
        if (a1 == maxScore) result.add(1);
        if (a2 == maxScore) result.add(2);
        if (a3 == maxScore) result.add(3);

        // 5. 리턴 타입에 맞추기 위해 result > answer 배열로 변환
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}