class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A","X");
        myString = myString.replace("B","Y");
        myString = myString.replace("X","B");
        myString = myString.replace("Y","A");
        if(myString.contains(pat)) return 1;
        else return 0;
    }
}