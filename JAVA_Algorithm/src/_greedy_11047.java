import java.util.Scanner;

public class _greedy_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, sum;
		n = sc.nextInt();
		k = sc.nextInt();
		sum = 0;
		
		int A[] = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		
		for(int i=n-1; i>=0; i--) {
			if (k >= A[i])
				sum += k/A[i];
				k %= A[i];
		}
		System.out.println(sum);
		
	}

}
