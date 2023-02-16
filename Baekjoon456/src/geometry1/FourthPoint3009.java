package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthPoint3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] points = new int[2][2];
		
		// 첫번째, 두번째 점
		StringTokenizer st;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());
		}

		// 세번째 점
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		// 네번째 점
		int fourthX;
		int fourthY;
		
		/*
		 * 1. 세번째 점의 x좌표가 첫번째 점의 x좌표와 같은 경우
		 * 2. 세번째 점의 x좌표가 두번째 점의 x좌표와 같은 경우
		 */
		if (x == points[0][0]) {
			fourthX = points[1][0];
		} else if (x == points[1][0]) {
			fourthX = points[0][0];
		} else {
			fourthX = x;
		}
		
		if (y == points[0][1]) {
			fourthY = points[1][1];
		} else if (y== points[1][1]) {
			fourthY = points[0][1];
		} else {
			fourthY = y;
		}
		
		System.out.println(fourthX + " " + fourthY);
	}

}
