package operators;

public class DivByZero {
	public static void main(String[] args) {
		try {
			System.out.println((int)(10/0));
		}catch(ArithmeticException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println((float)(10/0));
		}catch(ArithmeticException e) {
			e.printStackTrace(System.out);
		}
	}
}
