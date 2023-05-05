class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        boolean odd = true;
        for(int i = 0; i < strArr.length; i++) {
            if(odd) {
                answer[i] = strArr[i].toLowerCase();
                odd = false;
            }else{
                answer[i] = strArr[i].toUpperCase();
                odd = true;
            }
        }
        return answer;
    }
}