package Level0.최빈값구하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
// 23.07.30 25분

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int solution(int[] numArr) {
        int answer;

        Arrays.sort(numArr);

        int length = numArr.length;
        int[] cnt = new int[numArr[length - 1] + 1]; // numArr 숫자들이 얼마나 나왔는지 카운팅
        for (int num : numArr) {
            cnt[num]++;
        }

        List<Integer> maxes = new ArrayList<>(); // 가장 많이 나온 숫자들의 리스트(여러개 일 수 있으므로)

        for (int i = 0; i < cnt.length; i++) {
            if (maxes.size() > 0 && cnt[maxes.get(0)] == cnt[i]) {
                maxes.add(i);
            } else if (maxes.size() > 0 && cnt[maxes.get(0)] < cnt[i]) {
                maxes = new ArrayList<>();
                maxes.add(i);
            } else if (maxes.size() == 0) {
                maxes.add(i);
            }
        }

        if (maxes.size() > 1) {
            answer = -1;
        } else {
            answer = maxes.get(0);
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            new int[]{1, 1, 2, 2}));
    }

}
