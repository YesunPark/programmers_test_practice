package 가위바위보_프로그래머스입문;

import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("2", "0");
        hashMap.put("0", "5");
        hashMap.put("5", "2");

        for (String item : rsp.split("")) {
            answer.append(hashMap.get(item));
        }

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("205"));
    }
}
