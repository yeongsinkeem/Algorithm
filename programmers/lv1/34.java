class Solution {
    public String solution(int[] food) {
        String answer = "";
        // 1. 왼쪽 ~ 중간
        for(int i = 1; i < food.length; i++) {
            int k = food[i] / 2;
            if ( k != 0 ) {
                for (int j = 0; j < k; j++) {
                    answer += i;
                }
            }
        }
        // 2. 중간 ~ 오른쪽
        StringBuffer strBuf = new StringBuffer(answer);
        String str = strBuf.reverse().toString();
        answer += 0;
        answer += str;

        return answer ;
    }
}
