package Level1.과일장수;
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
// 23.08.19 30분

import java.util.Arrays;

class Solution {

    public int solution(int k, int m, int[] score) {
        // k점이 최상품, 1점이 최하품, m개씩 담아 포장
        int answer = 0;

        if (score.length < m) {
            return 0;
        }

        Arrays.sort(score);

        int cnt = 0; // 현재 상자에 담긴 과일의 수
        for (int i = score.length - 1; i >= 0; i--) {
            cnt++;
            if (cnt == m) {
                answer += m * score[i];
                cnt = 0;
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}
        ));
    }
}

