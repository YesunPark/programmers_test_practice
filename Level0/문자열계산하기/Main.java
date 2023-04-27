package Level0.문자열계산하기;
// 23.04.27 15분 소요중(해결 중)
class Solution {
    public int solution(String my_string) {
        int answer = 0;


        int idx = 0;
        while (idx < my_string.length()) {

            String cal = "";
            for (String str : my_string.split("")) {
                StringBuilder number = new StringBuilder();
                if (!"".equals(number.toString()) && !"".equals(cal)) {

                }

                if ("".equals(str)) {
                    continue;
                } else if ("+".equals(str) || "-".equals(str)) {
                    cal = str;
                } else {
                    number.append(str);
                }

                idx++;
            }


        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3 + 4"));
    }
}
