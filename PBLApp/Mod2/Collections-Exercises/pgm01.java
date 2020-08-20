
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm01 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		Collections.sort(colors);
		System.out.println(colors);
	}
}
