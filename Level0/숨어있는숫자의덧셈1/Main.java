package Level0.숨어있는숫자의덧셈1;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (String str : my_string.split("")) {
            if ((int) str.charAt(0) < 65) {
                answer += Integer.parseInt(str);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution("aAb1B2cC34oOp")));
    }

}