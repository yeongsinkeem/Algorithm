// 8:46 - 10:20
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 1. 조건에 해당하는 데이터만 배열에 저장
        List <int[]> filteredData = new ArrayList<>();
        if (ext.equals("code")) {
            for (int i = 0; i < data.length; i++) {
                // val_ext보다 작은 값들만 저장
                if ( data[i][0] < val_ext ) {
                    filteredData.add(data[i]);
                }
            }
        } else if (ext.equals("date")) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][1] < val_ext) {
                    filteredData.add(data[i]);
                }
            }
        }
        else if (ext.equals("maximum")) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][2] < val_ext) {
                    filteredData.add(data[i]);
                }
            }
        }
        else {
            for (int i = 0; i < data.length; i++) {
                if (data[i][3] < val_ext){
                    filteredData.add(data[i]);
                }
            }
        }
        // 2. sort_by에 따라 정렬할 대상 정하기
        // 정렬을 위한 comparator 선언
        Comparator<int[]> comparator;
        switch (sort_by) {
            case "code":
                comparator = Comparator.comparingInt(arr -> arr[0]);
                break;
            case "date":
                comparator = Comparator.comparingInt(arr -> arr[1]);
                break;
            case "maximum":
                comparator = Comparator.comparingInt(arr -> arr[2]);
                break;
            default:
                comparator = Comparator.comparingInt(arr -> arr[3]);
                break;
        }
        // 3. List인 filteredData를 배열로 변환 후 comparator 기준으로 정렬
        int[][] answer = filteredData.toArray(new int[0][]);
        Arrays.sort(answer, comparator);

        return answer;

    }
}