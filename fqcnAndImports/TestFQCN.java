package fqcnAndImports;
// Type Import on Demand
import java.util.ArrayList;
// Single Type Import -> Always takes precedence over Type Import on Demand
import java.util.List;

public class TestFQCN {
	public static void main(String[] args) {
		java.lang.String s = "This is a FCQN Import Test!!!";
		System.out.println(s);
		// Fully Qualified Class Name Style
		fqcnAndImports.HelloWorld.main(args);
		List<String> myList = new ArrayList<>();
		System.out.println(myList.toString());
	}
	
	
}
