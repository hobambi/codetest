class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = a+""+b;
        String y = b+""+a;
        answer = Math.max(Integer.parseInt(x),Integer.parseInt(y));
        return answer;
    }
}