class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String fir = a + "" + b;
        answer = Math.max(Integer.parseInt(fir),(2*a*b));
        return answer;
    }
}