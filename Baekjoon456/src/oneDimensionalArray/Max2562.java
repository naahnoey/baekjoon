package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 */
public class Max2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[9];
		int max = 0;
		int index = -1;
		
		for (int i=0; i<9; i++) {
			num[i] = Integer.parseInt(br.readLine());
			
			if (num[i] > max) {
				max = num[i];
				index = i + 1;
			}
		}
		
		bw.write(max + "\n" + index);
		bw.close();
	}

}
