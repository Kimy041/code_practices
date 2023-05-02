import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        for(int i = 0; i < R; i++) {
            String[] str = br.readLine().split(" ");

            int N = Integer.parseInt(str[0]);
            String S = str[1];
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < N; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}