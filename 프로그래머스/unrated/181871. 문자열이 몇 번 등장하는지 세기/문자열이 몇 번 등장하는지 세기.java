class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i <= myString.length()-pat.length(); i++) {
            if(myString.charAt(i) == pat.charAt(0)) {
                String temp = myString.substring(i,i+pat.length());
                if(temp.equals(pat)) answer++;
            }
        }
        
        return answer;
    }
}