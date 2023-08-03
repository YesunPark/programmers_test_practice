package Level1.햄버거만들기;
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
// 23.08.03 15분

import java.util.Stack;

class Solution {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 1) == 1 && stack.get(size - 2) == 3
                    && stack.get(size - 3) == 2 && stack.get(size - 4) == 1) {
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}
        ));
    }

}
