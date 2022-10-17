package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
// 참고 - https://ssdragon.tistory.com/m/32
public class OX8598 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		byte beforeAnswer;
		int score, sum;
		
		for (int i=0; i<t; i++) {
			beforeAnswer = 'X';
			score = 0;
			sum = 0;
			
			for (byte currentAnswer : br.readLine().getBytes()) {
				// if문마다 st.nextToken() 호출 시 이중호출 오류 발생
				if (currentAnswer == 'O' && beforeAnswer == 'O')
					score++;
				else if (currentAnswer == 'O')
					score = 1;
				else if (currentAnswer == 'X')
					score = 0;
				
				sum += score;
				beforeAnswer = currentAnswer;
			}
			bw.write(sum + "\r\n");
		}
		bw.close();
	}

}
