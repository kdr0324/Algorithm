import java.util.NoSuchElementException;
import java.util.Scanner;

public class _math_11423 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, m;
		String str;
		
		int prime[] = new int[10000001];
		int DP[] = new int[10000001];
				
		
		
		for(int i=2; i<10000001; i++) {
			DP[i] = DP[i-1];
			if(prime[i] == 0) {
				eratos(prime, i);
				DP[i]++;
			}
		}
		
		
		while(true) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			System.out.println(DP[m]-DP[n-1]);
			
			str = sc.nextLine();
			try {
				str = sc.nextLine();
			}catch(NoSuchElementException e){
				System.exit(0);
			}
			
			if(str == null) break;		
			System.out.println();
		}
		
	}
	
	static void eratos(int[] prime, int n) {
		for(int i=2; i*n < 10000001; i++) {
			prime[i*n] = 1;
		}
	}
}
