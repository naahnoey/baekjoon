import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication2588 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.valueOf(br.readLine());
		String num2 = br.readLine();
		
		// (3)
		System.out.println(num1 * (num2.charAt(2) - '0'));
		// (4)
		System.out.println(num1 * (num2.charAt(1) - '0'));
		// (5)
		System.out.println(num1 * (num2.charAt(0) - '0'));
		
		// (6)
		System.out.println( num1 * Integer.valueOf(num2) );
		
	}

}
