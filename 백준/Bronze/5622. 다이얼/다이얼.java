import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[] arr = br.readLine().getBytes();
        int A = 0;

        for(byte b : arr) {
            if(b < 'A'){ break;}
            else if (b < 'D') { A += 3;}
            else if (b < 'G') { A += 4;}
            else if (b < 'J') { A += 5;}
            else if (b < 'M') { A += 6;}
            else if (b < 'P') { A += 7;}
            else if (b < 'T') { A += 8;}
            else if (b < 'W') { A += 9;}
            else if (b < '[') { A += 10;}
        }
        System.out.println(A);
    }
}