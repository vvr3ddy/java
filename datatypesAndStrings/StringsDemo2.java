package datatypesAndStrings;

public class StringsDemo2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		s1.concat(s1);
		System.out.println(s1); // Doesn't update to HelloHello because Strings are immutable
		s1 = s1.concat(s1);
		System.out.println(s1);
		s1 = s1.replace('H', 'h');
		System.out.println(s1);
	}
}
