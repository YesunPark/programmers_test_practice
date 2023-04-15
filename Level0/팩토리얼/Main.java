package Level0.팩토리얼;
// https://school.programmers.co.kr/learn/courses/30/lessons/120848
// 23.04.15 20분 소요

class Solution {
    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer++;
            if (factorial(answer) == n) {
                return answer;
            } else if (factorial(answer) > n) {
                return answer - 1;
            }
        }
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }
}
