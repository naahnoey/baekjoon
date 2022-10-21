package string;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class Dial5622 {

	public static void main(String[] args) throws IOException {
		int time = 0;
		int alphabet;
		
		do {
			alphabet = System.in.read();
			
			switch (alphabet) {
			case 'A':	case 'B':	case 'C':
				time += 3;
				break;
				
			case 'D':	case 'E':	case 'F':
				time += 4; 
				break;
				
			case 'G':	case 'H':	case 'I':
				time += 5; 
				break;
				
			case 'J':	case 'K':	case 'L':
				time += 6; 
				break;
			case 'M':	case 'N':	case 'O':
				time += 7; 
				break;
                
			case 'P':	case 'Q':	case 'R':	case 'S':
				time += 8; 
				break;
                
			case 'T':	case 'U':	case 'V':
				time += 9; 
				break;
                
			case 'W':	case 'X':	case 'Y':	case 'Z':
				time += 10; 
				break;
			}
		} while (alphabet != '\n');
		
		System.out.println(time);
		
		// BufferedReader 사용
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String word = br.readLine();
//		
//		int time = 0;
//		for (int i=0; i<word.length(); i++) {
//			int alphabet = word.charAt(i);
//			
//			if (alphabet>='A' && alphabet<='C')
//				time += 3;
//			else if (alphabet>='D' && alphabet<='F')
//				time += 4;
//			else if (alphabet>='G' && alphabet<='I')
//				time += 5;
//			else if (alphabet>='J' && alphabet<='L')
//				time += 6;
//			else if (alphabet>='M' && alphabet<='O')
//				time += 7;
//			else if (alphabet>='P' && alphabet<='S')
//				time += 8;
//			else if (alphabet>='T' && alphabet<='V')
//				time += 9;
//			else if (alphabet>='W' && alphabet<='Z')
//				time += 10;
//		}
//		
//		System.out.println(time);
	}

}
