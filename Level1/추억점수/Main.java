package Level1.추억점수;
//https://school.programmers.co.kr/learn/courses/30/lessons/176963
// 23.07.30 15분

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>(); // <인물이름,그리움 점수>
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String[] onePhoto = photo[i];
                if (map.get(onePhoto[j]) != null) { // 그리움 점수가 있는 인물이라면
                    score += map.get(onePhoto[j]);
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
            new String[]{"may", "kein", "kain", "radi"},
            new int[]{5, 10, 1, 3},
            new String[][]{
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
            })));
    }

}
