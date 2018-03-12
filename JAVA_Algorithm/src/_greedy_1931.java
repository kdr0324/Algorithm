import java.util.Arrays;
import java.util.Scanner;

public class _greedy_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int s_min, sum;
		
		s_min=0;
		sum=0;
		
		n = sc.nextInt();
	
		lecture lect[] = new lecture[n];
		
		for(int i=0; i<n; i++) {
			lect[i] = new lecture(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(lect);
		
		s_min = lect[0].e;
		sum++;
		
		for(int i=1; i<n; i++) {
			if(lect[i].s >= s_min) {
				s_min = lect[i].e;
				sum++;
			}
			
		}
		System.out.println(sum);		
	}
}


class lecture implements Comparable<lecture>{
	int s;
	int e;
	
	lecture(int s, int e){
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(lecture lect) {
		// TODO Auto-generated method stub
		if(this.e < lect.e)
			return -1;
		else if(this.e == lect.e)
		{
			if(this.s < lect.s)
				return -1;
			else if(this.s == lect.s)
				
				return 0;
			else
				return 1;
		
		}
		else
			return 1;
	}
}