package Level0.숨어있는숫자의덧셈2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120864
// 23.04.17 15분 소요(미해결)
import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<String> nums = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            nums.add(i + "");
        }

        StringBuilder num = new StringBuilder();
        for (String str : my_string.split("")) {
            if (nums.contains(str)) {
                num.append(str);
            } else {
                if (!num.toString().equals("")) {
                    answer += Integer.parseInt(num.toString());
                }
                num = new StringBuilder();
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1a2b3c4d123Z"));
    }
}
