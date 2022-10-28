package twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoredPaper2563 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken());
		
		boolean[][] whitePaper = new boolean[100][100];
		
		// 색종이 붙은 위치만 true 처리
		for (int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++)
					whitePaper[x+j][y+k] = true;
			}
		}
		
		// 배열 돌며 true값 찾을 때마다 넓이+1
		int area = 0;
		for (boolean[] wp : whitePaper) {
			for (boolean w : wp) {
				if (w == true)
					area++;
			}
		}
		
		System.out.println(area);
	}

}
