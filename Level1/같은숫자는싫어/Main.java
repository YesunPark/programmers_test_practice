package Level1.같은숫자는싫어;
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
// 23.08.25 20분

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {

    public int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int num : arr) {
            if (deque.size() == 0 || deque.peekLast() != num) {
                deque.addLast(num);
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
            new int[]{1, 1, 3, 3, 0, 1, 1}
        )));
    }
}

