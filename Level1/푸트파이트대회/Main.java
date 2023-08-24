package Level1.푸트파이트대회;
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 23.08.24 10분

class Solution {

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }

        answer.append(sb);
        answer.append(0);
        answer.append(sb.reverse());

        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            new int[]{1, 3, 4, 6}
        ));
    }

}
