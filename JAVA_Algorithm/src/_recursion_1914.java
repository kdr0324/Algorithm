import java.math.BigInteger;
import java.util.Scanner;

public class _recursion_1914 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		BigInteger big = BigInteger.ONE;
		for(int i=0; i<N; i++)
			big = big.multiply(BigInteger.TWO);
		big = big.add(BigInteger.valueOf(-1));
		
		System.out.print(big);
		

		if(N <= 20)
			Hanoi(N, 1, 2, 3);
		
		
	}
	
	static void Hanoi(int n, int from, int by, int to) {
		if(n==1) 
			move(n, from, to);
		else {
			Hanoi(n-1, from, to, by);
			move(n, from, to);
			Hanoi(n-1, by, from, to);
		}
			
		
	}
	
	static void move(int n, int from, int to){
		System.out.println();
		System.out.print(from +" "+ to);
	}
	
	
	

}
