// 09:52 시작 ~ 10:42 종료
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 1. 가변, 원소 제거를 위해서 cards를 List로 변환
        List <String> lst1 = new ArrayList<>(Arrays.asList(cards1));
        List <String> lst2 = new ArrayList<>(Arrays.asList(cards2));

        String answer = "";
        int freq = 0;

        for (int i = 0; i < goal.length; i++) {
            if ( !lst1.isEmpty() && goal[i].equals(lst1.get(0)) ) {
                lst1.remove(lst1.get(0));
                freq += 1;
            }
            else if ( !lst2.isEmpty() && goal[i].equals(lst2.get(0)) ) {
                lst2.remove(lst2.get(0));
                freq += 1;
            }
            else {
                answer = "No";
                break;
            }
        }
        if (freq == goal.length) {
            answer = "Yes";
        }
        else {
            answer = "No";
        }
        return answer;
    }
}