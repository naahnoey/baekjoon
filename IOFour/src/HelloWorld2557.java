// 2557

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HelloWorld2557 {

	public static void main(String[] args) throws IOException {
		
		// 1.
		System.out.println("Hello World!");
		
		// 2. 성능 개선
		// throws IOException 필요
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!");
		bw.close();

	}

}
