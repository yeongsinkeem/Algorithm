import java.util.Stack;

class Solution {
    public int solution(int [] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();

        for (int a:ingredient) {
            burger.push(a);

            // 1. 원소가 4개 이상일 때 마다 패턴 확인
            if (burger.size() >= 4) {
                // 2. 스택의 크기 저장
                int size = burger.size();
                // 3. 만약 패털 확인한다면
                if (burger.get(size-4) == 1 && burger.get(size-3) == 2 && burger.get(size-2) == 3 && burger.get(size-1) == 1) {
                    answer += 1;
                    burger.pop();
                    burger.pop();
                    burger.pop();
                    burger.pop();
                }
            }
        }
        return answer;
    }
}