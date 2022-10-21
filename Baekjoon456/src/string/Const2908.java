package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Const2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int newA, newB;
		
		newA = (a % 10 * 100) + (a%100 - a%10) + (a / 100);
		newB = (b % 10 * 100) + (b%100 - b%10) + (b / 100);
		
		System.out.println(Math.max(newA, newB));
	}

}
