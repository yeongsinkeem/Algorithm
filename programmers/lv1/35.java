import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. 자기자신에게 빌려야 하는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ( lost[i] == reserve[j] ) {
                    answer ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 2. 친구에게 빌려야 하는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
                    answer ++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
