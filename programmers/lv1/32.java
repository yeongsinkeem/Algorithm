class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        // 1. 배열 전체 순회하며 가로, 세로 중 더 큰 값을 가로로 더 작은 값을 세로로 모으기
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            sizes[i][0] = max;
            sizes[i][1] = min;
        }
        // 2. 가로 중 가장 큰 값, 세로 중 가장 큰 값이 정답
        int wMax = sizes[0][0];
        int hMax = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if ( wMax < sizes[i][0] ) wMax = sizes[i][0];
            if ( hMax < sizes[i][1] ) hMax = sizes[i][1];
        }

        answer = wMax * hMax;

        return answer;
    }
}