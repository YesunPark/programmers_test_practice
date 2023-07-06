package Level0.최댓값만들기2;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = returnAnswer(numbers, numbers.length - 1, numbers.length - 2);

        return answer;
    }

    public int returnAnswer(int[] numbers, int idx1, int idx2) {
        int last1 = numbers[idx1];
        int last2 = numbers[idx2];

        if (last1 > 0 && last2 > 0) {
            return last1 * last2;
        } else {
            return numbers[0] * numbers[1];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, -3, 4, -5}));
    }
}
