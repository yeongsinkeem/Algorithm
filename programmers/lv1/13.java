// 09:12 시작 ~ 10:24 종료
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1. 문자열 파싱
        String date1 = "20160101";
        String date2 = String.format("2016%02d%02d", a, b);
        String dateFormatType = "yyyyMMdd";
        long days = 0;

        // 2. 날짜 계산
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormatType);
        try {
            Date from = simpleDateFormat.parse(date1);
            Date to = simpleDateFormat.parse(date2);
            long diff = to.getTime() - from.getTime();
            long re = diff / 86400000L; // 밀리초를 일 단위로 변환
            days = re;
        } catch (ParseException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        }
        // 3. 날짜 / 7 의 나머지에 따라 요일 계산
        int rem = (int)days % 7;
        switch (rem) {
            case 0: answer = "FRI";
                break;
            case 1: answer = "SAT";
                break;
            case 2: answer = "SUN";
                break;
            case 3: answer = "MON";
                break;
            case 4: answer = "TUE";
                break;
            case 5: answer = "WED";
                break;
            case 6: answer = "THU";
                break;
        }
        return answer;
    }
}