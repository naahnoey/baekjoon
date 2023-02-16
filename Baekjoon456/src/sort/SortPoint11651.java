package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortPoint11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] points = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			points[i][0] = x;
			points[i][1] = y;
		}
		
		Arrays.sort(points, (int[] p1, int[] p2) -> p1[1] == p2[1] ? p1[0] - p2[0] : p1[1] - p2[1]);
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++) {
			sb.append(points[i][0]).append(' ').append(points[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
