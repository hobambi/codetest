class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        answer += Character.toUpperCase(s.charAt(0));
        boolean blank=false;
        for (int i = 1; i < s.length(); i++) {
            boolean up = false;
            if(s.charAt(i)==' ')
                blank=true;
            else if(s.charAt(i) != ' ' && blank){
                Character.toUpperCase(s.charAt(i));
                up = true;
                blank = false;
            }
            if (up) answer += Character.toUpperCase(s.charAt(i));
            else answer += s.charAt(i);
        }
        return answer;
    }
}