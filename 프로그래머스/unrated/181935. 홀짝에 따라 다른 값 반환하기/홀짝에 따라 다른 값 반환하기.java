class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 1) {
            answer = (int)Math.pow((n/2+1),2);
        }
        else {
            int temp = n/2;
            answer = 2*(temp)*(temp+1)*(2*temp+1)/3;
        }
        return answer;
    }
}