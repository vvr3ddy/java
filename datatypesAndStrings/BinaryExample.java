package datatypesAndStrings;

public class BinaryExample {
	public static void main(String[] args) {
		byte b1 = 0b1010101;
		System.out.println(b1);
		byte b2 = (byte) 0b10000000; // without type casting it to byte, by default the value is treated as an int
		System.out.println(b2);
		int i1 = 0000_0000_0000_0100;
		System.out.println(i1);
//		int i2 = null; -> this is an error because null is not a valid initialization for a primitive data type
		
		boolean input1 = true, input2 = false; // Line 1
		boolean result1 = input1 = !input1; // Line 2
		boolean result2 = input2 = input1; // Line 3
		boolean result3 = input1 == (result1 = !input2); // Line 4
		System.out.println(input1 + " " + input2 + " " + result2 + " " + result3);

	}
}
