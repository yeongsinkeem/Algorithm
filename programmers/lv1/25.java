class Solution {
    public int solution(int n) {
        int answer = 0;
        // 인덱스와 숫자 직접 대응시키기 위해 n+1로 크기 설정
        boolean[] primeNum = new boolean[n + 1];

        // 1. 우선 n 이하의 모든 수를 소수라고 가정
        for (int i = 2; i <= n; i++) {
            primeNum[i] = true;
        }
        // 2. 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= n; i++) {
            if (primeNum[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeNum[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++){
            if (primeNum[i]) answer ++;
        }
        return answer;
    }
}