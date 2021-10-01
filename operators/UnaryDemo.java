package operators;

public class UnaryDemo {
	public static void main(String[] args) {
		short a = 10;
		short b = 5;
		char c = 3;

		a *= b -= c--; // Line 1
		Object d = a % 3; // Line 2

		String dtype = "short";
		if (d instanceof Integer)
			dtype = "int"; // Line 3
		else if (d instanceof Character)
			dtype = "char";
		else if (d instanceof Long)
			dtype = "long";
		else if (d instanceof Float)
			dtype = "float";
		else if (d instanceof Double)
			dtype = "double";

		System.out.println(dtype + " " + d);
	}
}
