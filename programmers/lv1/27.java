//10:04 ~
import java.util.stream.IntStream;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int []numArr = new int[number + 1];

        // 1. 약수 배열 만들기
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {  // i의 제곱근까지 반복
                if (j * j == i) count++;
                else if (i % j == 0) count +=2; // j와 i / j가 모두 약수이므로 2개를 카운트
            }
            numArr[i] = count;
        }

        // 2. 약수 배열 순회하며 limit을 넘으면 ~
        for(int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i + 1] > limit) numArr[i + 1] = power;
        }

        answer = IntStream.of(numArr).sum();

        return answer;
    }
}