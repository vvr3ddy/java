package datatypesAndStrings;

public class StringComparisions {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ABC";
//		Uses s1.charAt(IdxWhereStringsDiffer) - s2.charAt(IdxWhereStringsDiffer)
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		s2 = "abcdef";
		System.out.println(s2.compareTo(s1));
//		Uses s2.length() - s1.length() given that s1 is a substring of s2 starting from idx 0
		s2 = "defabc";
		System.out.println(s2.compareTo(s1));

	}
}
