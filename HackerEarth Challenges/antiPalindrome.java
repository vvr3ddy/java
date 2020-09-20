import java.util.*;

class antiPalindrome {
	public static void main(String args[]) throws Exception {
		Scanner read = new Scanner(System.in);
		int T = Integer.parseInt(read.next());
		read.nextLine();
		String[] s = new String[T];
		for (int i = 0; i < T; i++) {
			s[i] = read.nextLine();
		}

		for (int index = 0; index < s.length; index++) {
			String myString = s[index];
			StringBuilder temp = new StringBuilder(myString);
			StringBuilder tempreverse = new StringBuilder(temp.reverse());
			if (myString.contentEquals(tempreverse)) {
				System.out.println("-1");
			} else {
				char[] ch = myString.toCharArray();
				Arrays.sort(ch);
				System.out.println(ch);
			}
		}
	}
}
