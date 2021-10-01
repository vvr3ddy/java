package datatypesAndStrings;

public class UnsignedExample {
	public static void main(String[] args) {
		
		System.out.println("Max and Min value of Int:"+Integer.MAX_VALUE+" and "+ Integer.MIN_VALUE);
		int testInt = (int) Integer.MAX_VALUE +3;
		System.out.println(testInt);
		
		long l = (long) Integer.MAX_VALUE + 3;
		System.out.println(l);
//		Conversion to unsigned int is as follows
		String sInt = Integer.toUnsignedString(testInt);
		System.out.println(sInt);
		
		int vInt = Integer.parseUnsignedInt(sInt);
		System.out.println(vInt);
	}
}
