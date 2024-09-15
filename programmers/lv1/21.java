class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 1;    // 비교할 대상이 되는 idx
        int score1 = 1;
        int score2 = 0;

        // 1. ch에 문자 기록
        char ch = s.charAt(0);
        while(idx < s.length()) {
            // 2. idx번째 문자와 같은지 다른지 횟수 세기
            if ( ch == s.charAt(idx) ) score1 ++;
            else score2 ++;

            // 3. 횟수인 score1과 score2 비교
            if ( score1 == score2 ) {
                answer ++;
                // 4. ch는 새로운 문자로 변경 + score1, score2 초기화 + idx 변경
                if ( idx + 1 < s.length() ) {
                    ch = s.charAt(idx + 1);
                    idx ++;
                    score1 = 1;
                    score2 = 0;
                }
            }
            idx ++;
        }
        if (idx == s.length()) answer ++;

        return answer;
    }
}