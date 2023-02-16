package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoordinateCompression18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력 받은 N개의 좌표
		int[] points = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			points[i] = Integer.parseInt(st.nextToken());
		}
		
		// 입력 받은 좌표를 정렬할 새로운 배열
		int[] sortedPoints = new int[n];
		for (int i=0; i<n; i++) {
			sortedPoints[i] = points[i];
		}
		Arrays.sort(sortedPoints);
		
		/*
		 * <좌표, 좌표 순위>
		 * 정렬된 좌표 배열을 순서대로 돌면서 rank++
		 */
		HashMap<Integer, Integer> pointMap = new HashMap<Integer, Integer>();
		int rank = 0;
		for (int p : sortedPoints) {
			if (!pointMap.containsKey(p)) {
				pointMap.put(p, rank);
				rank++;
			}
		}
		
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++) {
			sb.append(pointMap.get(points[i])).append(' ');
		}
		System.out.println(sb);
	}

}
