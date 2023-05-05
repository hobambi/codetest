class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 && b%2 == 1) { // 모두 홀수
            answer = a*a + b*b;
        }else if(a%2==0 && b%2==0) { // 모두 짝수
            answer = Math.abs(a-b);
        }else{ // 반반
            answer= 2*(a+b);
        }
        return answer;
    }
}