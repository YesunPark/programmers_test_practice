package Level0.문자열정렬하기2;
// 24.04.13 10분 소요
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowerCase = my_string.toLowerCase();
        int[] array = new int[lowerCase.length()];

        int idx = 0;
        for (char c : lowerCase.toCharArray()) {
            array[idx] = c;
            idx++;
        }

        Arrays.sort(array);
        StringBuilder answer = new StringBuilder();
        for (int num : array) {
            answer.append((char) num);
        }

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad"));
    }
}
