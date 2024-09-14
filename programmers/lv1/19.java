import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int nums = 0;
        int zero = 0;

        // 1. lottos 배열 정렬
        Arrays.sort(lottos);
        // 2. 0의 개수 세기
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero ++;
            }
            else break;
        }
        // 3. 번호 맞히기
        for (int i = 0; i < lottos.length - zero; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if ( lottos[ i + zero] == win_nums[j] ) nums++;
            }
        }
        // 4. 순위 반환
        // nums와 zero는 반비례 관계가 아니다 !
        answer[0] = Math.min(7 - (nums + zero), 6);
        answer[1] = Math.min(7 - nums, 6);
    }
    }