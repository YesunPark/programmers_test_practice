package Level0.전국대회선발고사;
// https://school.programmers.co.kr/learn/courses/30/lessons/181851
// 2023.07.25 실패, 07.26 10분 성공!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>(); // <등수, 학생 번호>

        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }

        System.out.println(map); // 풀이용 출력

        Arrays.sort(rank); // 등수 순서대로 정렬

        List<Integer> answers = new ArrayList<>();

        int idx = 1;
        while (answers.size() < 3) {
            if (attendance[map.get(idx)]) {
                answers.add(map.get(idx));
            }
            idx++;
        }

        return 10000 * answers.get(0) + 100 * answers.get(1) + answers.get(2);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution(new int[]{3, 7, 2, 5, 4, 6, 1},
            new boolean[]{false, true, true, true, true, false, false})));
    }
}