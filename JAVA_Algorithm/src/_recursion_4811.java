import java.util.Scanner;

public class _recursion_4811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		for (int i = 0; i < 1000; i++) {
			num = sc.nextInt();
			if (num == 0)
				break;
			
			System.out.println(pillDP(num));

		}

	}

	static int pill(int W, int H) {

		if (W == 0 && H == 0) {
			return 1;
		} else if (W == 0) {
			return pill(W, H - 1);
		} else if (H == 0) {
			return pill(W - 1, H + 1);
		}

		return pill(W - 1, H + 1) + pill(W, H - 1);
	}

	static long pillDP(int num) {
		long catalan[] = new long[num+1];
		
		catalan[0] = catalan[1] = 1;
		
		for(int i=2; i<=num; i++) {
			catalan[i] = 0;
			for(int j=0; j<i; j++)
				catalan[i] += catalan[j] * catalan[i-j-1];
			
		}
		return catalan[num];
	}

}
