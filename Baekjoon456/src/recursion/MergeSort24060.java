package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort24060 {
	
	static int[] a;
	static int k;
	static int count = 0;
	
	// A[p..r]을 오름차순 정렬
	public static void mergeSort(int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;	// q는 p, r의 중간 지점
			mergeSort(p, q);	// 전반부 정렬
			mergeSort(q+1, r);	// 후반부 정렬
			merge(p, q, r);		//병합
		}
	}
	
	/*
	 * A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
	 * A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
	 */
	public static void merge(int p, int q, int r) {
	    int i = p;
	    int j = q + 1;
	    int t = 0;
	    int[] tmp = new int[r-p+1];
	    
	    while (i <= q && j <= r) {
	        if (a[i] <= a[j]) {
	        	tmp[t++] = a[i++];
	        }
	        else {
	        	tmp[t++] = a[j++];
	        }
	    }
	    while (i <= q)	// 왼쪽 배열 부분이 남은 경우
	        tmp[t++] = a[i++];
	    while (j <= r)	// 오른쪽 배열 부분이 남은 경우
	        tmp[t++] = a[j++];
	    
	    i = p;	t = 0;
	    
	    while (i <= r) {	// 결과를 A[p..r]에 저장
	        a[i++] = tmp[t++];
	        count++;
	        
	        if (count == k) {
	        	System.out.println(a[i-1]);
	        	System.exit(0);
	        }
	    }
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 배열 A 크기
		k = Integer.parseInt(st.nextToken());	// 저장 횟수
		a = new int[n];	// 배열 A
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(0, n-1);
		System.out.println(-1);
	}

}
