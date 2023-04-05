// 23.4.5 1분 소요 https://school.programmers.co.kr/learn/courses/30/lessons/120910
package 세균증식;

class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 10));
    }
}
