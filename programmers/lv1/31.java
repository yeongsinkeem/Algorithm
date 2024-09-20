class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            char ch;

            // 1. 공백이라면
            if ( c == ' ' )
                ch = ' ';
            // 2. 대문자라면
            else if ( c >= 65 && c <= 90 ) {
                int caesar = c + n;
                if (caesar > 90) {
                    caesar = (caesar - 90 + 64;
                }
                ch = (char) caesar;
            }
            // 3. 소문자라면
            else {
                int caesar = c + n;
                if (caesar > 122) {
                    caesar = (caesar - 122) + 96;
                }
                ch = (char) caesar;
            }
            answer += ch;
        }
        return answer;
    }
}