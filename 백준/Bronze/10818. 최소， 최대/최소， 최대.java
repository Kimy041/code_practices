import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int index = 0;
		int[] array = new int[n];
		
		while(st.hasMoreTokens()) {
			array[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[n-1]);
		
	}
}