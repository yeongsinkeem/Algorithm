import java.util.stream.IntStream;

class Solution {
    public int solution(String dartResult) {
        int []numArr = new int[4];
        int answer;
        int idx = 1;

        // 1. 반복문으로 순회하면서 numArr에 숫자 저장하기
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            // 2. 숫자 처리
            if ( numArr[idx-1] == 1 && c == '0' ) {
                // 들어올 숫자가 10이라면 그에 맞는 처리
                numArr[idx-1] = 10;
                continue;
            }
            else if ( c - '0' >= 0 && c - '0' <= 9 ) {
                numArr[idx] = c - '0';
                idx ++;
                continue;
            }
            // 3. 문자 처리
            if ( c == 'D' ) {
                numArr[idx - 1] = (int) Math.pow(numArr[idx-1], 2);
            }
            else if ( c == 'T') {
                numArr[idx - 1] = (int) Math.pow(numArr[idx-1], 3);
            }
            else if ( c == '*') {
                numArr[idx - 1] *= 2;
                numArr[idx - 2] *= 2;
            }
            else if ( c == '#') {
                numArr[idx - 1] *= -1;
            }
        }
        answer = IntStream.of(numArr).sum();
        return answer;
    }
}