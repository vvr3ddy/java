package fqcnAndImports;

// Testing Import Static Statements
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class TestImportStatic {
	public static void main(String[] args) {
		int radius = 2;

		double circumference = 2 * PI * radius;
		System.out.println(circumference);
		
		double sqrt144 = sqrt(144);
		System.out.println(sqrt144);
	}
}
