package Level0.가까운수;
// https://school.programmers.co.kr/learn/courses/30/lessons/120890
// 23.04.15 20분 소요

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;

        int gap = Integer.MAX_VALUE;

        Arrays.sort(array);
        for (int num : array) {
            if (Math.abs(n - num) < gap) {
                gap = Math.abs(n - num);
                    answer = num;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{10, 11, 12}, 11));
    }
}
