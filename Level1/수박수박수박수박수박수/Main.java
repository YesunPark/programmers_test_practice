package Level1.수박수박수박수박수박수;
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
// 23.08.15 3분

class Solution {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer.append("박");
            } else {
                answer.append("수");
            }
        }

        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
    }
}
