class Solution {
    int [][] keypad = {
            {3, 1},
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {1, 1},
            {1, 2},
            {2, 0}, // 7
            {2, 1},
            {2, 2},
            {3, 0},
            {3, 2}
    };

    // 맨해튼 거리 계산 함수
    public int calDist(int start, int target){
        return Math.abs(keypad[start][0] - keypad[target][0]) +
                Math.abs(keypad[start][1] - keypad[target][1]);
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";

        // 1. 초기 위치 설정
        int leftPos = 10;
        int rightPos = 11;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftPos = number;
            }
            else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightPos = number;
            }
            // 키패드가 2, 5, 8, 0 이라면 맨해튼 거리 계산
            else {
                int leftDist = calDist(leftPos, number);
                int rightDist = calDist(rightPos, number);

                if (leftDist < rightDist) {
                    answer += "L";
                    leftPos = number;
                }
                else if (rightDist < leftDist) {
                    answer += "R";
                    rightPos = number;
                }
                else {
                    if ( hand.equals("left") ) {
                        answer += "L";
                        leftPos = number;
                    }
                    else {
                        answer += "R";
                        rightPos = number;
                    }
                }
            }
        }
        return answer;
    }
}