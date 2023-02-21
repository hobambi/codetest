class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int dap=1;
            switch (arr[1]) {
                case "+":
                    dap = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                    break;
                case "-":
                    dap = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                    break;
            }
            if(dap==Integer.parseInt(arr[4])) answer[i] ="O";
            else answer[i] ="X";
        }
        return answer;
    }
}