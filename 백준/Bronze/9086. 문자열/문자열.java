import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		
		for(int a = 0 ; a<i; a++) {
			String S = br.readLine();
			System.out.println(""+S.charAt(0)+S.charAt(S.length()-1));
		}
		
	}
}