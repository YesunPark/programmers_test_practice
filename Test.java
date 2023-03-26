// https://school.programmers.co.kr/learn/courses/30/lessons/120836

// 22.03.26 해결 못함
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] * arr[j] == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(20));
    }
}



