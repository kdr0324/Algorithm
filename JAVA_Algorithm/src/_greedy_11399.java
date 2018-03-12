import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _greedy_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum;
		n = sc.nextInt();
		int P[] = new int[n];
		for(int i=0; i<n; i++) {
			P[i] = sc.nextInt();
		}
		
		Arrays.sort(P);
		sum = P[0];
		for(int i=1; i<n; i++) {
			P[i] = P[i-1] + P[i];
			sum = sum + P[i];
		}
		System.out.println(sum);
	}
}
