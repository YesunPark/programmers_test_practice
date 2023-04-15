package Level0.k의개수;
// https://school.programmers.co.kr/learn/courses/30/lessons/120887
// 23.04.15 10분 소요

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            for (String str : (l + "").split("")) {
                if ((k == Integer.parseInt(str))) answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 13, 1));
    }
}
