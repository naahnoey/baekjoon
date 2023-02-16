package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] modeArr = new int[8001];
		
		int sum = 0;
		int min = 4001;
		int max = -4001;
		
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			modeArr[num + 4000]++;
			
			// 총합
			sum += num;
			
			// 범위
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		
		// 중앙값
		int count = 0;
		int median = -5000;
		
		for (int i = min+4000; i <= max+4000; i++) {
			if (modeArr[i] > 0)
				count += modeArr[i];
			
			if (count >= (n+1)/2) {
				median = i - 4000;
				break;
			}
		}
		
		sb.append(Math.round(1.0*sum/n)).append('\n');	// Math.round() - 반올림
		sb.append(median).append('\n');
		sb.append(findMode(modeArr, min, max)).append('\n');
		sb.append(max - min);
		
		System.out.println(sb);
	}
	
	
	// 최빈값 구하는 함수
	static int findMode(int[] arr, int min, int max) {
		int count = 0;
		int mode = -5000;
		boolean flag = false;	// 최빈값이 다수인 경우 true
		
		for (int i = min+4000; i <= max+4000; i++) {
			if (arr[i] > count) {
				count = arr[i];
				flag = false;
				mode = i - 4000;
			}
			else if (arr[i] == count) {
				if (!flag) {
					flag = true;
					mode = i - 4000;
				}
			}
		}
		
		return mode;
	}

}
