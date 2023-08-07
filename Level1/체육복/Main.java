package Level1.체육복;
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
// 23.08.07 30분 (70점)

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> reserveList = new ArrayList<>();

        for (int r : reserve) {
            reserveList.add(r);
        }

        for (int l : lost) {
            if (reserveList.contains(l)) {
                reserveList.remove((Object) l);
            }
        }


        for (int los : lost) {
            if (reserveList.contains(los - 1)) {
                reserveList.remove((Object) (los - 1));
                answer++;
            } else if (reserveList.contains(los + 1)) {
                reserveList.remove((Object) (los + 1));
                answer++;
            }
        }
        System.out.println(reserveList);

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            5,
            new int[]{2, 4},
            new int[]{1, 3, 5}
        ));
    }

}
