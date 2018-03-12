import java.util.Scanner;

public class _11719 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<100 && sc.hasNextLine(); i++) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
