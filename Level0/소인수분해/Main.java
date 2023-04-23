package Level0.소인수분해;
// 23.04.23 15분 소요
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();

        int num = 2;
        while (n > 1) {
            int divisor = 0;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    divisor++;
                }
            }

            if (divisor < 3 && n % num == 0) {
                set.add(num);
                n /= num;
            } else {
                num++;
            }
        }

        int[] answer;
        answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(420)));
    }
}
