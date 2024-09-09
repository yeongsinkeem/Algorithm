class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> chart = new ArrayList<>;
        for (int i = 0; i < score.length; i++) {
            if ( i < k ) {
                chart.add(score[i]);
                Collections.sort(chart);
            }
            else {
                if (chart.get(0) < score[i]) {
                    chart.set(0, score[i]);
                    Collections.sort(chart);
                }
            }
            answer[i] = chart.get(0);
        }
    }
    return answer;
}