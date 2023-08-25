package Level1.푸트파이트대회;
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 23.08.24 10분

import java.util.ArrayDeque;
import java.util.Deque;

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

class Solution2 {

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(0);

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                deque.addFirst(i);
                deque.addLast(i);
            }
        }

        for (Integer integer : deque) {
            answer.append(integer);
        }

        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.solution(
            new int[]{1, 3, 4, 6}
        ));

        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(
            new int[]{1, 3, 4, 6}
        ));
    }

}
