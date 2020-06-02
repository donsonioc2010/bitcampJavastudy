import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		while(true) {
			a = sc.nextInt();
			if(a<41)
				break;
		}
		int zero=0,one=0;
		if(fibonacci(a)==0)
			zero =zero+1;
		else if(fibonacci(a)==1)
			one = one +1;
		System.out.println(zero + " "+one);
	}
	public static int fibonacci(int n) {
		if(n==0) {
			System.out.println("0");
			return 0;
		}else if(n== 1) {
			System.out.println("1");
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
