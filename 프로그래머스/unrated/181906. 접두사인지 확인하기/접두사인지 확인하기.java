class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String cut = "";
        if(my_string.length() >= is_prefix.length())
            cut = my_string.substring(0,is_prefix.length());
        else return 0;
        if(cut.equals(is_prefix)) answer = 1;
        else answer = 0;
        return answer;
    }
}