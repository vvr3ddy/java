package datatypesAndStrings;

public class NarrowingAndWidening {
	public static void main(String[] args) {
//		Narrowing Example
		float f = 1023.99f;
		int i = (int) f;
		System.out.println(i); // /lossy conversion
		
//		Widening Example
		char ch = 'a';
		int in = ch;
		System.out.println(in);
		
	}
}
