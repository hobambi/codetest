import java.util.*;
class Solution {
    public int solution(int[][] maps) {
		int answer = 0;

		int x = 0;
		int y = 0;
		int[] garo = {1, 0, -1, 0};
		int[] sero = {0, 1, 0, -1};
		int m = maps[0].length;
		int n = maps.length;

		int[][] visited = new int[n][m];
		visited[x][y] = 1;

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});

		while (!q.isEmpty()) {
			int[] node = q.poll();
			// if(node[0] >= m )

			for (int i = 0; i < 4; i++) {
				int tempX = node[0] + garo[i];
				int tempY = node[1] + sero[i];

				if (tempX < 0 || tempY < 0 || tempX >= n || tempY >= m )
					continue;

				if (visited[tempX][tempY] == 0 && maps[tempX][tempY] == 1) {
					visited[tempX][tempY] = visited[node[0]][node[1]] + 1;
					q.offer(new int[] {tempX, tempY});
				}
			}
		}
		if (visited[n - 1][m - 1] == 0)
			answer = -1;
		else
			answer = visited[n - 1][m - 1];
		return answer;
    }
}