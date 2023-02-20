class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() != spell.length) {
                continue;
            }
            for (int j = 0; j < spell.length; j++) {
                int length = dic[i].length();
                dic[i] = dic[i].replace(spell[j], "");
                if ((length - 1) == dic[i].length() && dic[i].equals(""))
                    return 1;
                else if((length - 1) != dic[i].length())
                        break;
            }
        }
        return answer;
    }
}