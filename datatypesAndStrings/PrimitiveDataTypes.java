package datatypesAndStrings;

public class PrimitiveDataTypes {
	public static void main(String[] args) {

		System.out.println("Size of byte: " + (Byte.SIZE / 8));
		System.out.println("Max:" + Byte.MAX_VALUE + " Min: " + Byte.MIN_VALUE);

		System.out.println("Size of short" + (Short.SIZE / 8));
		System.out.println("Max: " + Short.MAX_VALUE + " Min: " + Short.MIN_VALUE);

		System.out.println("Size of int:" + (Integer.SIZE / 8));
		System.out.println("Max: " + Integer.MAX_VALUE + " Min: " + Integer.MIN_VALUE);

		System.out.println("Size of long:" + (Long.SIZE / 8));
		System.out.println("Max: " + Long.MAX_VALUE + " Min: " + Long.MIN_VALUE);

		System.out.println("Size of char:" + (Character.SIZE / 8));
		System.out.println("Max: " + Character.MAX_VALUE + " Min: " + Character.MIN_VALUE);

		System.out.println("Size of float:" + (Float.SIZE / 8));
		System.out.println("Max: " + Float.MAX_VALUE + " Min: " + Float.MIN_VALUE);

		System.out.println("Size of double: " + (Double.SIZE / 8));
		System.out.println("Max: " + Double.MAX_VALUE + " Min: " + Double.MIN_VALUE);
	}
}
