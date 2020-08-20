import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm02 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		Collections.sort(colors);
		for(String item: colors) {
			System.out.println(item);
		}
	}
}
