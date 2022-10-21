package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		char alphabet;
		
		int count = 0;
		
		for (int i=0; i<word.length(); i++) {
			alphabet = word.charAt(i);
			
			if (i == word.length()-1) {
				count++;
				break;
			}
			
			switch(alphabet) {
			case 'c':
				alphabet = word.charAt(i + 1);
				
				if (alphabet == '=' || alphabet == '-')
					i++;
				
				count++;
				break;
				
			case 'd':
				alphabet = word.charAt(i + 1);
				
				if (alphabet == '-')
					i++;
				else if (alphabet == 'z' && i<word.length()-2) {
					alphabet = word.charAt(i+2);
					
					if (alphabet == '=')
						i += 2;
				}
				
				count++;
				break;
				
			case 'l': case 'n':
				alphabet = word.charAt(i + 1);
				
				if (alphabet == 'j')
					i++;
				
				count++;
				break;
				
			case 's': case 'z':
				alphabet = word.charAt(i + 1);
				
				if (alphabet == '=')
					i++;
				
				count++;
				break;
				
			default:
				count++;
			}
		}
		
		System.out.println(count);
	}

}
