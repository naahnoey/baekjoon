package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class FindAlphabet10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alphabet = new int[26];
		for (int i=0; i<26; i++)
			alphabet[i] = -1;
		
		String s = br.readLine();
		for (int i=0; i<s.length(); i++) {
			if (alphabet[s.charAt(i) - 'a'] != -1)
				continue;
			
			alphabet[s.charAt(i) - 'a'] = i;
		}
		
		for (int a : alphabet)
			bw.write(a + " ");
		
		bw.close();
	}

}
