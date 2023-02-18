class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        answer[0] =  ((int)Math.ceil((double) total/num) - (num/2));
        for (int i = 1; i < num; i++) {
            answer[i] = answer[i-1] +1;
        }
        return answer;
    }
}