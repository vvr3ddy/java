package datatypesAndStrings;

public class StringsDemo1 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("ABC");
		String s3 = s2.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s1);
	}
}
