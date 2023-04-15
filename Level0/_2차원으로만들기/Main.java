package Level0._2차원으로만들기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120842
// 23.04.15 10분 소요
import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        int idx = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
    }
}
