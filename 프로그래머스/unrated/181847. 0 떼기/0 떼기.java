class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        if(n_str.charAt(0) != '0') return n_str;
        boolean zero = true;
        
        int index = 0;
        while(n_str.length() > 0) {
            n_str = n_str.replaceFirst("0","");
            if(n_str.charAt(index) != '0') break;
        }
        return n_str;
    }
}