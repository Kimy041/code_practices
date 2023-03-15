package do_it.chap01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요."); 
		System.out.print("a의 값 : "); int a = scanner.nextInt(); 
		System.out.print("b의 값 : "); int b = scanner.nextInt();
		System.out.print("c의 값 : "); int c = scanner.nextInt();
		System.out.println("중간값 : "+ med3( a , b , c));
	}
	
	static int med3( int a , int b , int c) {
		int med = 0;
		if( a >= b ) 
			if( b >= c ) 
				med = b;
		if( b >= a )
			if( a >= c)
				med = a;
		if( a >= c )
			if( c >= b)
				med = c;
		return med;
	}
	
	static int med3G(int a, int b, int c) {
	   if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
        		return a;
        else if (b > c)
            return c;
        else
            return b;
    }
	
}
    
/*
	처음 if 문의 판단
	  if ((b >= a && c<= a) || (b <= a && c >= a)
	에 주목합니다. 
	여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
	(실질적으로 동일한 판단)이, 계속하여  else 이후에서
	 else if ((a > b && c < b) || (b <= a && c > b)
	로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우,
	2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,
	효율이 나빠집니다.
*/
