package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeanMedian2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int[] numbers = new int[5];
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sum += n;
			numbers[i] = n;
		}
		Arrays.sort(numbers);
		
		sb.append(sum/5).append('\n').append(numbers[2]);
		System.out.println(sb);
	}

}
