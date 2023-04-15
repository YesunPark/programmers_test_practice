package Level0.중복된문자제거;
// 23.04.13 5분 소요
import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();
        for (String str : my_string.split("")) {
            if (!list.contains(str)) list.add(str);
        }

        for (String str : list) {
            answer.append(str);
        }

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("people"));
    }
}
