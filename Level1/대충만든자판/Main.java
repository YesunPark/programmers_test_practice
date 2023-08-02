package Level1.대충만든자판;
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
// 23.08.02 20분

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> map = new HashMap<>();
        // 문자, 키보드를 눌러야 하는 최소 횟수

        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                String str = key.split("")[j];

                if (map.get(str) == null) { // 맵에 문자에 해당되는 정보가 없을 때
                    map.put(str, j + 1);
                } else if (map.get(str) != null && map.get(str) > j + 1) {
                    // 문자에 해당되는 정보가 있고, 현재 누르는 횟수가 더 작을 때
                    map.put(str, j + 1);
                }
            }
        }

        for (int i = 0; i< targets.length; i++) {
            String target = targets[i];
            int cnt = 0;
            for (String s : target.split("")) {
                if (map.get(s) == null) {
                    cnt = -1;
                    break;
                } else {
                    cnt += map.get(s);
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
            new String[]{"ABACD", "BCEFD"},
            new String[]{"ABCD", "AABB"}
        )));
    }

}
