package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;

/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class WordStudy1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alphabet = new int[26];
		String word = br.readLine();
		
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) - 'a' < 26 && word.charAt(i) - 'a' >= 0)
				alphabet[word.charAt(i) - 'a']++;
			else
				alphabet[word.charAt(i) - 'A']++;
		}
		
		int max = 0;
		int maxAlphabet = -1;
		for (int i=0; i<26; i++) {
			if (alphabet[i] == max)
				maxAlphabet = '?';
			
			else if (alphabet[i] > max) {
				max = alphabet[i];
				maxAlphabet = i;
			}
		}
		
		if (maxAlphabet != '?')
			bw.write(Character.toString(maxAlphabet + 'A'));
		else
			bw.write(Character.toString(maxAlphabet));
		bw.close();
		
		// HashMap 사용 - 시간도 더 걸리고 메모리도 훨씬 많이 잡아먹지만 궁금해서...
//		HashMap<String, Integer> alphabet = new HashMap<>();
//
//		String word = br.readLine();
//		
//		for (int i=0; i<word.length(); i++) {
//			String character = Character.toString(word.charAt(i));
//			
//			if ((word.charAt(i) - 'a') < 26)
//				character = character.toUpperCase();
//			
//			if (alphabet.get(character) == null)
//				alphabet.put(character, 1);
//			else
//				alphabet.put(character, alphabet.get(character)+1);
//		}
//		
//		Set<Entry<String, Integer>> entrySet = alphabet.entrySet();
//		String maxAlphabet = "";
//		int max = 0;
//		for (Entry<String, Integer> entry : entrySet) {
//			if (entry.getValue() == max)
//				maxAlphabet = "?";
//			
//			else if (entry.getValue() > max) {
//				max = entry.getValue();
//				maxAlphabet = entry.getKey();
//			}
//		}
//		bw.write(maxAlphabet);
//		bw.close();
	}

}
