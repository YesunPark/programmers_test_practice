package Level0.공던지기;

// 23.04.26 15분 소요
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[((2 * (k - 1)) % numbers.length)];
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}, 2));
    }
}
