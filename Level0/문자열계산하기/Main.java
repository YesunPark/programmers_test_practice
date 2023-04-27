package Level0.문자열계산하기;

// 23.04.27 30분 소요
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        int idx = 0;

        String cal = "";
        StringBuilder number = new StringBuilder();
        for (String str : my_string.split("")) {
            if (" ".equals(str)) {
                continue;
            }

            if ("+".equals(str) || "-".equals(str)) {
                if ("".equals(cal)) {
                    answer = Integer.parseInt(number.toString());
                } else if ("+".equals(cal)) {
                    answer += Integer.parseInt(number.toString());
                } else {
                    answer -= Integer.parseInt(number.toString());
                }

                cal = str;
                number = new StringBuilder();
            } else {
                number.append(str);
            }
        }

        if ("+".equals(cal)) {
            answer += Integer.parseInt(number.toString());
        } else {
            answer -= Integer.parseInt(number.toString());
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3 + 4"));
    }
}
