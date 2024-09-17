import java.util.*;

class Solution{
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] alphabet = new String[26];
        char ch = 'a';

        // 1. 새로운 알파벳 배열 생성
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(ch);
            ch++;
        }
        List<String> newAlpha = new ArrayList<>(Arrays.asList(alphabet));
        for (int i = 0; i < skip.length; i++) {
            String skipCh = String.valueOf(skip.charAt(i));
            newAlpha.remove(skipCh);
        }
        int len = newAlpha.size();

        // 2. s 순회하며 변경
        for (int i = 0; i < s.length(); i++) {
            int replaceIdx = newAlpha.indexOf(String.valueOf(s.charAt(i)));
            int newIdx = (replaceIdx + index) % len;
            answer += newAlpha.get(newIdx);
        }
        return answer;
    }
}