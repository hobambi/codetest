class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String temp = n+""; //good
        answer = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            answer[i] = (int) (n%10);
            n = n/10;
        }
        return answer;
    }
}