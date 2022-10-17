package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
public class MinMax10818 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		// 배열 사용 X
//		st = new StringTokenizer(br.readLine());
//		
//		int min = Integer.parseInt(st.nextToken());
//		int max = min;
//		int num;
//		
//		while (st.hasMoreTokens()) {
//			num = Integer.parseInt(st.nextToken());
//			
//			if (num < min)	min = num;
//			else if (num > max) max = num;
//		}
//		
//		bw.write(min + " " + max);
//		bw.close();
		
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = num[0];
		int max = min;
		for (int i=1; i<n; i++) {
			if (num[i] > max)	max = num[i];
			else if (num[i] < min)	min = num[i];
		}
		
		bw.write(min + " " + max);
		bw.close();
		
	}
	
}
