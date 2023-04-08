package Level0.인덱스바꾸기;
// 23.04.09 10분 소요

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();

        String str1 = my_string.split("")[num1];
        String str2 = my_string.split("")[num2];

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer.append(str2);
            } else if (i == num2) {
                answer.append(str1);
            } else {
                answer.append(my_string.split("")[i]);
            }
        }

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 1, 2));
    }
}
