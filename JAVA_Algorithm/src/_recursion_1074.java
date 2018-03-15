import java.util.Scanner;

public class _recursion_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, r, c;
		
		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(Z(N, r, c));
		
	}
	
	static int Z(int N, int r, int c) {
		int num = (int)Math.pow(2, N-1);
		
		if(N == 1)
			return r*2 + c;
		
		if (r < num && c < num) {
			 return Z(N-1, r, c);
		}
		else if(r < num) {
			return num*num + Z(N-1, r, c-num);
		}
		else if(c < num) {
			return num*num*2 + Z(N-1, r-num, c);
		}
		else {
			return num*num*3 + Z(N-1, r-num, c-num);
		}		
	}
	
}
