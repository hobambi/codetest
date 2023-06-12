class Solution {
    public int solution(String number) {
        if(number.length() == 1){
            if(Integer.parseInt(number) < 9) return Integer.parseInt(number);
            else return 0;
        }

        
        int answer = 0;
        
        for(int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        answer = answer%9;
        return answer;
    }
}