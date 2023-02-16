package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star2447 {
	
	static boolean[][] stars;	// true == blank
	
	public static void drawStar(int n, int x, int y, boolean blank) {
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					stars[i][j] = true;
				}
			}
			return;
		}
		
		if (n == 1) {
			return;
		}
		
		/*
		 * n = 27인 경우 한 블록의 사이즈는 9
		 * n = 9인 경우 한 블록의 사이즈는 3
		 * n = 3인 경우 한 블록의 사이즈는 1
		 */
		int size = n / 3;
		int count = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				if (count == 5) {
					drawStar(size, i, j, true);
				} else {
					drawStar(size, i, j, false);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		stars = new boolean[n][n];
		
		drawStar(n, 0, 0, false);
		
		for (boolean[] star : stars) {
			for (boolean s : star) {
				if (s)
					bw.write(" ");
				else
					bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
	}

}
