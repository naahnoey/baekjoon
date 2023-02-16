package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 입력 받은 체스판은 boolean 배열에 저장 (T-흰색, F-검은색)
 * 8*8 크기로 체스판을 돌며 각 사각형 당 바꿀 칸이 가장 적은 사각형 확인
 */
public class Chess1018 {
	
	public static int cutChess(boolean[][] c, int x, int y, boolean first) {
		boolean[][] chess = new boolean[c.length][c[0].length];
		
		// 배열 복사
		for (int i=0; i<c.length; i++) {
			chess[i] = c[i].clone();
		}
		
		int count = 0;
		
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if (i == x && j == y)	continue;
				
				if (first == chess[i][j] && j != y) {
					count++;
					chess[i][j] = !first;
				}
				else if (first != chess[i][j] && j == y) {
					count++;
					chess[i][j] = first;
				}
				first = chess[i][j];
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] chess = new boolean[n][m];
		for (int i=0; i<n; i++) {
			String line = br.readLine();
			
			for (int j=0; j<m; j++) {
				if (line.charAt(j) == 'W')
					chess[i][j] = true;
			}
		}
		
		int count = 1000;
		for (int i = 0; i <= n-8; i++) {
			for (int j = 0; j <= m-8; j++) {
				// 기존
				int nextCount = cutChess(chess, i, j, chess[i][j]);
				
				// 바꿀 칸이 0개면 중단
				if (nextCount == 0)	{
					System.out.println(0);
					return;
				}
				
				if (count > nextCount) {
					count = nextCount;
				}
				
				// 첫 칸 반대
				nextCount = cutChess(chess, i, j, !chess[i][j]) + 1;
				
				if (count > nextCount) {
					count = nextCount;
				}
			}
			
		}
		System.out.println(count);
	}

}
