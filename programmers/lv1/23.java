// 16:14 ~ 17:55
import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++) {
            // sum 초기화
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                // lst : targets의 키패드를 누르는 횟수
                ArrayList<Integer> lst = new ArrayList<>();

                for(int k = 0; k < keymap.length; k++) {
                    int push = keymap[k].indexOf(targets[i].charAt(j));
                    // 인덱스를 가지고 있다면 lst에 포함
                    if (push != -1 ){
                        lst.add(push + 1);
                    }
                }
                // targets를 만들 수 있다면
                if (!lst.isEmpty())
                    sum += Collections.min(lst);
                    // targets를 만들 수 없다면 - lst는 비어있을 것
                else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}