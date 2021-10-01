package datatypesAndStrings;

import java.util.Arrays;

public class StringBuilderDemos {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("  ABCD           ");
		System.out.println("Original Value of SB:" + sb + ".");
		System.out.println("Length of SB:" + sb.length());
		System.out.println("Capacity of SB:" + sb.capacity());

		sb.trimToSize(); // Attempts to reduce storage used for character sequence
		System.out.println("Current Value of SB" + sb + ".");
		System.out.println("Length of SB:" + sb.length());
		System.out.println("Capacity of SB:" + sb.capacity()); // clearly the capacity is now only 17
//		A method to trim / strip a string builder value
		sb.replace(0, sb.length(), sb.toString().trim());
		System.out.println(sb);
		char[] chars = new char[10];
		sb.toString().getChars(0, sb.length(), chars, 0);
		System.out.println(Arrays.toString(chars));

		StringBuilder sb2 = new StringBuilder(10);
		System.out.println(sb2.capacity());

		StringBuilder builder = new StringBuilder(5); // Line 1
		builder.append("abcdefghijklmnopqrstuvwxyz"); // Line 2
		char[] myCharArray; // Line 3
		if ("hello" == "hello")
			myCharArray = new char[5];
		builder.getChars(0, 5, new char[5], 0); // Line 4
		System.out.println(new String(myCharArray).trim() + "*"); // Line 4
	}
}
