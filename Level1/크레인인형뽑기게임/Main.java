package Level1.크레인인형뽑기게임;
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
// 23.08.07 35분

import java.util.Objects;
import java.util.Stack;

class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int idx = move - 1;

            for (int i = 0; i < board.length; i++) {
                if (board[i][idx] != 0) {
                    stack.push(board[i][idx]);
                    board[i][idx] = 0;
                    break;
                }
            }

            if (stack.size() >= 2 &&
                Objects.equals(stack.get(stack.size() - 1), stack.get(stack.size() - 2))) {
                stack.pop();
                stack.pop();
                answer += 2;
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
            },
            new int[]{1, 5, 3, 5, 1, 2, 1, 4}
        ));
    }

}
