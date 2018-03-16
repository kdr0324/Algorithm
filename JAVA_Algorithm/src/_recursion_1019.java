import java.util.Scanner;

public class _recursion_1019 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int tmp;
		int p[] = new int[10];
		
		int i = page(N, p);
		
	
		for(; i<N+1; i++) {
			tmp = i;
			while(tmp>0) {
				p[tmp%10]++;
				tmp = tmp/10;
			}
		}
		
		for(int a : p) {
			System.out.print(a + " ");
		}
		
	}
	
	static int page(int n, int[]  p) {
		int k = (int)Math.log10(n);
		int t = n/(int)Math.pow(10, k);
		
		for(int i=0; i<10; i++)
			p[i] = t * (k) * (int)Math.pow(10, k-1);
		
		for(int i=1; i<t; i++)
			p[i] += (int)Math.pow(10, k);
		
		for(int i=0; i<=k-1; i++)
			p[0] -= (int)Math.pow(10, i);
		
		return t*(int)Math.pow(10, k);
	}
}
