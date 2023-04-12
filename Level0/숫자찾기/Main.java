package Level0.숫자찾기;

// 23.4.11 5분 소요
class Solution {
    public int solution(int num, int k) {
        int answer = 0;

        String string = num + "";

        for (int i = 0; i < string.split("").length; i++) {
            if (Integer.valueOf(string.split("")[i]) == k) {
                answer = i + 1;
                break;
            }
        }

        return answer == 0 ? -1 : answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29183, 1));
    }
}
