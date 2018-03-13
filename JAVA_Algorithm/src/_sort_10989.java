import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _sort_10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int num;
		
		
		int arr[] = new int[10001];
		
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		for(int i=1; i<=10000; i++) {
			if(arr[i] > 0) {
				for(int j=0; j<arr[i]; j++)
					bw.write(Integer.toString(i)+"\n");
					bw.flush();
			}
		}
				
	}
}
