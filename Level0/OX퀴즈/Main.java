package Level0.OX퀴즈;
// https://school.programmers.co.kr/learn/courses/30/lessons/120907
// 23.07.27 40분

import java.util.Arrays;

class Solution {

    public String[] solution(String[] quizzes) {
        String[] answer = new String[quizzes.length];

        for (int i = 0; i < quizzes.length; i++) {
            String[] quizSplitArr = quizzes[i].split(" "); // 공백을 기준으로 split

            int result = 0; // 주어진 공식대로 계산한 올바른 결과값

            StringBuilder symbol = new StringBuilder("+"); // 가장 첫번째 숫자는 더해야 하니 +로 초기화

            // quizSplitArr 길이에서 -2:  계산를 위해 '=' 기호와 문자열에서 주어진 결과값 제외
            for (int j = 0; j < quizSplitArr.length - 2; j++) {
                String item = quizSplitArr[j];
                try {
                    result = "+".equals(symbol.toString()) ?
                        result + Integer.parseInt(item)
                        : result - Integer.parseInt(item);
                    // Integer.parseInt 적용 시 +, - 는 NumberFormatException 발생하므로 try catch 사용
                } catch (NumberFormatException e) {
                    if ("+".equals(item)) {
//                        symbol = new StringBuilder("+"); 새로 할당하는 방법을 써도 되지만 속도면에서 손해
                        symbol.setLength(0); // 길이를 0으로 해서 초기화
                        symbol.append("+");
                    } else {
                        symbol.setLength(0);
                        symbol.append("-");
                    }
                }
            }
            // 식대로 계산한 결과값과 문자열로 주어진 결과값 비교
            if (result == Integer.parseInt(quizSplitArr[quizSplitArr.length - 1])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("main: " + Arrays.toString(s.solution(new String[]{
            "3 - 4 = -3", "5 + 6 = 11"
        })));
    }
}
