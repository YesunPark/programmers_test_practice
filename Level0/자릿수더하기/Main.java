package Level0.자릿수더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";

        for (String s : str.split("")) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution(1234)));
    }

}