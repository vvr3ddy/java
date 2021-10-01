package datatypesAndStrings;

public class ScopeOfVariables {
	static String type = "this";

	public static void main(String[] args) {
		String s = (args.length > 0) ? "switch" : "";
		String caseVal = (args.length > 1) ? args[1] : "";

		if (s == "switch") {
			String type; // Line 1
			switch (caseVal) {

			case "this":
				type = "that";
				break;
			case "that":
				type = "this";
				break;
			case "other":
			default:
				type = "somethingelse";
			}
			if (type == "that")
				type = "this"; // Line 2

		}
		System.out.println("this is " + type); // Line 3
	}
}
