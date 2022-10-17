package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

// 참고 - https://coding-factory.tistory.com/m/250
public class Average4344 {

	public static void main(String[] args) throws IOException {
		// 백준에서 돌리니 계속 틀렸다고 나온다. 왜 틀렸는지 당장은 모르겠음...
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		HashSet<Integer> score;
//		int sum, avrg, count;
//		double result;
//		
//		int c = Integer.parseInt(br.readLine());
//		int n;
//		
//		// 각 케이스
//		for (int i=0; i<c; i++) {
//			score = new HashSet<Integer>();
//			
//			st = new StringTokenizer(br.readLine());
//			n = Integer.parseInt(st.nextToken());
//			sum = 0;
//			count = 0;
//			
//			// 학생별 점수
//			for (int j=0; j<n; j++) {
//				int s = Integer.parseInt(st.nextToken());
//				score.add(s);
//				sum += s;
//			}
//			avrg = sum / n;
//			
//			for (int s : score) {
//				if (s > avrg)
//					count++;
//			}
//			
//			result = 1.0 * count / n * 100;
//			bw.write(String.format("%.3f\r\n", result));
//		}
//		
//		bw.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[] score;
		double sum, avrg, count;
		double result;
		
		int c = Integer.parseInt(br.readLine());
		int n;
		
		// 각 케이스
		for (int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
            
			n = Integer.parseInt(st.nextToken());
            score = new int[n];
            
			sum = 0;
			count = 0;
			
			// 학생별 점수
			for (int j=0; j<n; j++) {
				int s = Integer.parseInt(st.nextToken());
				score[j] = s;
				sum += s;
			}
			avrg = sum / n;
			
			for (int s : score) {
				if (s > avrg)
					count++;
			}
			
			result = count / n * 100;
			bw.write(String.format("%.3f%%\n", result));
		}
		
		bw.close();
	}

}
