package Level1.최소직사각형;
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
// 23.09.05 30분

class Solution {

    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width;
            int hight;
            if (sizes[i][0] >= sizes[i][1]) {
                width = sizes[i][0];
                hight = sizes[i][1];
            } else {
                width = sizes[i][1];
                hight = sizes[i][0];
            }
            if (maxWidth < width) {
                maxWidth = width;
            }
            if (maxHight < hight) {
                maxHight = hight;
            }
        }

        return maxWidth * maxHight;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}
        ));
    }
}
