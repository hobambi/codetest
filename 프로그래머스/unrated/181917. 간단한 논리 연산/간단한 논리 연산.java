class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean one = true;
        boolean two = true;
        if(!x1 && !x2) one = false;
        if(!x3 && !x4) two = false;
        if(one && two) answer = true;        
        
        return answer;
    }
}