import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<Character, ArrayList<String>> map = new HashMap<>();

        // 1. [ "문자", ["문자열"] ]  형식의 hashMap 생성
        for (int j = 0; j < strings.length; j++) {
            ArrayList<String> lst = new ArrayList<String>();
            for (int k = j+1; k <= strings.length; k++) {
                if (strings[j].charAt(n) == strings[k].charAt(n)) {
                    lst.add(strings[j], strings[k]);
                }
                else {
                    lst.add(strings[j]);
                }
            }
            map.put(strings[i].charAt(n), lst);
        }
        // 2. Key로 정렬
        List<Character> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int i = 0;
        for (char c : keySet) {
            answer[i] = map.get(c);
            i++;
        }

        return answer;
    }
}