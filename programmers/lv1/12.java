import java.util.*;

class Solution {
    public(int[] solution(int[] numbers)) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1 ; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> lst = new ArrayList<Integer>(set);
        // 리스트의 크기를 알기 때문에 배열 생성 가능
        int[] answer  = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = lst.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}