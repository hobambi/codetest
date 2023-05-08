class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();
        
        for(int i = 0; i < first.length; i++) {
            answer += first[i];
            answer += second[i];
        }
        return answer;
    }
}