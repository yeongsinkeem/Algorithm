class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] repeatStr = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String babb : babbling) {
            // 1. 연속된 단어들이 포함되어 있으면 다음 word로 넘어가기
            if (babb.contains("ayaaya") || babb.contains("yeye") || babb.contains("woowoo") || babb.contains("mama")) continue;

            // 2. 발음 가능한 단어들 공백으로 변경
            babb = babb.replace("aya", " ");
            babb = babb.replace("ye", " ");
            babb = babb.replace("woo", " ");
            babb = babb.replace("ma", " ");
            babb = babb.replace(" ", ""); // 모든 공백 제거

            if (babb.length() == 0)
                answer ++;
        }

        return answer;

    }
}