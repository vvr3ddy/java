package datatypesAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSpliceAndDice {
	public static void main(String[] args) {
		String[] wordArray = new String[] { "Hello", "World", "This", "IS", "an", "example" };
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
		String sentence = "";
//		for(String word: wordArray) {
//			sentence += word+ " ";
//		}
//		Java 8 Style 
		sentence = String.join("-", wordList); // - is a delimiter
		System.out.println(sentence);
		sentence = String.join(" ", wordArray);
		System.out.println(sentence);
//		Splitting
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		words = sentence.split(" ", 3);
		System.out.println(Arrays.toString(words)); // -> Splits the string into three sections Hello, World and rest
		String trimmed = sentence.substring(5).trim();
		System.out.println(trimmed);
		
		String mississipi = "mississipi";
		System.out.println(mississipi.replaceAll("\\w+", "0"));
	}
}
