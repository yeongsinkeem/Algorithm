class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int kugo;   // 현재 가지고 있는 콜라 개수
        int mok;
        int rem;

        while ( kugo >= a ){
            mok = n / a;
            rem = n % a;
            answer += (mok * b);
            kugo = (mok * b) + rem;
        }
        return answer;
    }
}