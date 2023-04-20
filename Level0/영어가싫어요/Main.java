package Level0.영어가싫어요;
// 23.04.20 15분 소요  https://school.programmers.co.kr/learn/courses/30/lessons/120894

import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        String[] nums = {
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
        };
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i + "");
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            str.append(numbers.split("")[i]);
            if (map.get(str.toString()) != null) {
                answer.append(map.get(str.toString()));
                str = new StringBuilder();
            }
        }

        return Long.parseLong(answer.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("onetwothreefourfivesixseveneightnine"));
    }
}
