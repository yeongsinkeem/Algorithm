// 09:13 ~
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        List<Integer> lst = new ArrayList<>();

        // 1. 배열 중 3개 값 뽑아서 더한 값 lst에 넣기
        for (int i = 0; i < nums.length - 2; i ++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    lst.add(sum);
                }
            }
        }
        // 2. 소수인지 아닌지 판별
        for (int i = 0; i < lst.size(); i++) {
            boolean isPrime = true;
            int num = lst.get(i);

            for (int j = 2; j <= Math.sqrt(num) ; j++){
                if ( num % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                answer += 1;
            }
        }
        return answer;
    }
}