import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
 * 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
 */
public class Quadrant14681 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		int y = Integer.valueOf(br.readLine());
		
		if (x>0 && y>0)	System.out.println(1);
		else if (x<0 && y>0)	System.out.println(2);
		else if (x<0 && y<0)	System.out.println(3);
		else if (x>0 && y<0)	System.out.println(4);
		
	}

}
