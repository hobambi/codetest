class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] big = new int[n + 2][n + 2]; // 원래 배열을 감쌀 수 있는 큰 배열을 만듦

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {

                if (i == 0) big[i][j] = 0; // 테두리는 아무 것도 없어야하니까 .으로 채움
                else if (j == 0) big[i][j] = 0;
                else if (i == n + 1) big[i][j] = 0;
                else if (j == n + 1) big[i][j] = 0;
                else big[i][j] = board[i - 1][j - 1]; // 가운데는 원래 받은 배열 값을 넣
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                if (big[i][j] >= 1) {

                    big[i - 1][j - 1] = (big[i - 1][j - 1] != 1) ? -1 : 1;
                    big[i - 1][j] = (big[i - 1][j] != 1) ? -1 : 1;
                    big[i - 1][j + 1] = (big[i - 1][j + 1] != 1) ? -1 : 1;
                    big[i][j - 1] = (big[i][j - 1] != 1) ? -1 : 1;
                    big[i][j + 1] = (big[i][j + 1] != 1) ? -1 : 1;
                    big[i + 1][j - 1] = (big[i + 1][j - 1] != 1) ? -1 : 1;
                    big[i + 1][j] = (big[i + 1][j] != 1) ? -1 : 1;
                    big[i + 1][j + 1] = (big[i + 1][j + 1] != 1) ? -1 : 1;

                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(big[i][j]==0)
                    answer += 1;
            }
        }
        return answer;
    }
}