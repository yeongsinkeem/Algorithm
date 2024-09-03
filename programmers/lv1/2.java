class Solution {
    public String solution(String new_id) {
        // 1. 모든 대문자를 소문자로 변환
        String answer = new_id.toLowerCase();
        // 2. 허용되지 않는 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]*", "");
        // 3. 여러 개의 점을 하나로 변환
        answer = answer.replaceAll("\\.{2,}", ".");
        // 4. 처음이나 끝에 마침표가 위치하면 제거
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        // 5. 빈 문자열이라면 a 대입
        if (answer.isEmpty()) {
            answer = "a";
        }
        // 6. 길이가 16자 이상이라면
        if (answer.length() >= 16){
            answer = answer.substring(0,15);
            if (answer.endsWith(".")){
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        // 7. 길이가 2자 이하라면
        if (answer.length() <= 2) {
            char s = answer.charAt(answer.length() -1);
            while (answer.length() < 3) {
                answer += s;
            }
        }
        return answer;
    }
}