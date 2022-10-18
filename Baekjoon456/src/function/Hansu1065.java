package function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
public class Hansu1065 {

	public static void main(String[] args) throws IOException {
		Hansu1065 hansu = new Hansu1065();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i=1; i<=n; i++) {
			if (hansu.checkHansu(i))
				count++;
		}
		
		bw.write(count + "");
		bw.close();
	}
	
	boolean checkHansu(int n) {
		int beforeSub = 0;
		int currentSub;
		String strN = Integer.toString(n);
		
		for (int i=1; i<strN.length(); i++) {
			currentSub = (strN.charAt(i-1)-'0') - (strN.charAt(i)-'0');
			
			if (i == 1)	beforeSub = currentSub;
			
			if (currentSub != beforeSub)
				return false;
			
			beforeSub = currentSub;
		}
		return true;
	}

}
