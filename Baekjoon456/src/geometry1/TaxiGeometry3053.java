package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxiGeometry3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double r = Double.parseDouble(br.readLine());
		
		System.out.printf("%.6f\n%.6f", r*r * Math.PI, r * r * 2);
	}

}
