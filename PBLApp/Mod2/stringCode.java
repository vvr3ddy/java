import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSplitter {
	public StringBuilder calculateAsciiSum(String s) {

		StringBuilder asciiSum = new StringBuilder();
		List<Integer> sum = new ArrayList<Integer>();
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {

			char[] letters = words[i].toCharArray();
			int sum1 = 0;
			if (letters.length % 2 != 0) {
				for (int j = 0; j <= letters.length / 2; j++) {
					if (((letters.length - (j + 1)) - j) != 0) {

						sum1 += Math.abs((int) (letters[j] - letters[letters.length - (j + 1)]));
					} else {

						sum1 += Math.abs((int) (letters[j] - 64));
					}
				}
			} else {
				for (int j = 0; j < letters.length / 2; j++) {
					if (((letters.length - (j + 1)) - j) != 0) {

						sum1 += Math.abs((int) (letters[j] - letters[letters.length - (j + 1)]));
					} else {

						sum1 += Math.abs((int) (letters[j] - 64));
					}
				}
			}
			sum.add(sum1);
		}
		
		for(int i = 0; i<sum.size(); i++) {
			Integer num = sum.get(i);
			asciiSum.append(num.toString());
		}
		return asciiSum;
	}
}

class Main {
	public static void main(String[] args) {

		StringSplitter sp = new StringSplitter();

		Scanner read = new Scanner(System.in);

		String s = read.nextLine();
		System.out.println(sp.calculateAsciiSum(s.toUpperCase()));
//		String[] words  = s.split(" ");
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(i);
//		}

		read.close();
	}
}
