class Solution {
    public StringBuilder solution(int[] numLog) {
        
        StringBuilder answer = new StringBuilder();
        
        int pre = numLog[0];
        
        for(int i = 1; i < numLog.length; i++) {
            int result = numLog[i] - pre;
            if(result == 1) answer.append("w");
            else if(result == -1) answer.append("s");
            else if(result == 10) answer.append("d");
            else answer.append("a");
            
            pre = numLog[i];
        }
        
        return answer;
    }
}