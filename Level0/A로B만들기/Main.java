package Level0.A로B만들기;
// 23.04.15 10분 소요
import java.util.ArrayList;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;

        ArrayList<String> list = new ArrayList<>();
        for (String str : before.split("")) {
            list.add(str);
        }

        for (int i = 0; i < after.length(); i++) {
            if (list.contains(after.split("")[i])) {
                list.remove(after.split("")[i]);
            } else {
                return 0;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", "olleh"));
    }
}
