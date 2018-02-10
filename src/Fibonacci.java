
public class Fibonacci {
public static void main(String[] args) {
	int x = 1;
	int n = 1;
	System.out.println(0);
	System.out.println(x);
	for (int i = 0; i < 12; i++) {

		System.out.println(x);
		n=x-n;
		x=x+n;

		
	}
}
}
