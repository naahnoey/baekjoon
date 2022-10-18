package function;

/*
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 */
public class Sum15596 {

	long sum(int[] a) {
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}
