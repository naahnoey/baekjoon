package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class GroupWordChecker1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		char beforeCh;
		boolean isContinue;
		HashSet<Character> chArray;
		
		for (int i=0; i<n; i++) {
			String word = br.readLine();
			
			beforeCh = '0';
			isContinue = true;
			chArray = new HashSet<Character>();
			
			for (int j=0; j<word.length(); j++) {
				char ch = word.charAt(j);
				
				if (beforeCh == ch)	continue;
				
				if (chArray.contains(ch)) {
					isContinue = false;
					break;
				}
				
				chArray.add(ch);
				beforeCh = ch;
			}
			
			if (isContinue)	num++;
		}
		
		System.out.println(num);
	}

}
