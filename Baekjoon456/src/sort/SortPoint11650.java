package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortPoint11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		/*
		 * 좌표 저장
		 * 0열에 x, 1열에 y 저장
		 */
		int[][] coordinate = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			coordinate[i][0] = x;
			coordinate[i][1] = y;
		}
		
		/*
		 * 람다식 사용
		 * x 값 같으면 y값 비교
		 */
		Arrays.sort(coordinate, (int[] p1, int[] p2) -> {
			if (p1[0] == p2[0])
				return p1[1] - p2[1];
			else
				return p1[0] - p2[0];
		});
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++) {
			sb.append(coordinate[i][0]).append(' ').append(coordinate[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
