// 10:36 시작 ~ 11:19 종료
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int goal = nums.length / 2;

        // 1. 초기 작업
        Integer[] numArr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numArr[i] = nums[i];
        }
        // 2. HashSet 생성
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(numArr));
        // 3. set의 길이와 goal 비교
        if ( set.size() >= goal ) {
            return goal;
        }
        else {
            return set.size();
        }
    }
}